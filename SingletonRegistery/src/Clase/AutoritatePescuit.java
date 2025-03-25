package Clase;

import java.util.Date;
import java.util.Map;

public class AutoritatePescuit {
    private String denumire;
    private String website;
    private int nrAngajati;
    private Map<String,Autorizatie> registry;
    private static AutoritatePescuit instance=null;

    private AutoritatePescuit(String denumire, String website, int nrAngajati, Map<String, Autorizatie> registry) {
        this.denumire = denumire;
        this.website = website;
        this.nrAngajati = nrAngajati;
        this.registry = registry;
    }

    public static synchronized AutoritatePescuit getInstance(String denumire, String website, int nrAngajati, Map<String, Autorizatie> registry) {
        if(instance==null) {
            instance = new AutoritatePescuit(denumire, website, nrAngajati, registry);
        }
        return instance;
    }

    public Autorizatie emiteAutorizatie(String numePersoana){
        if(!registry.containsKey(numePersoana)) {
            registry.put(numePersoana, new Autorizatie(registry.size()+1,numePersoana,new Date().toString()));
        }
        return registry.get(numePersoana);
    }

    @Override
    public String toString() {
        return "AutoritatePescuit{" +
                "denumire='" + denumire + '\'' +
                ", website='" + website + '\'' +
                ", nrAngajati=" + nrAngajati +
                ", registry=" + registry +
                '}';
    }
}
