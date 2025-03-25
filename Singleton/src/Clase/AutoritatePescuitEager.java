package Clase;

public class AutoritatePescuitEager {

   private String denumire;
    private String website;
    private int nrAngajati;
    private int nrAutoritatiiEmise;

    private static AutoritatePescuitEager instance = new AutoritatePescuitEager("ANPA","anpa.ro",10,100);

    private AutoritatePescuitEager(String denumire, String website, int nrAngajati, int nrAutoritatiiEmise) {
        this.denumire = denumire;
        this.website = website;
        this.nrAngajati = nrAngajati;
        this.nrAutoritatiiEmise = nrAutoritatiiEmise;
    }

    public static AutoritatePescuitEager getInstance() {
        return instance;
    }

    public int getNrAutoritatiiEmise() {
        return nrAutoritatiiEmise;
    }

    public void setNrAutoritatiiEmise(int nrAutoritatiiEmise) {
        this.nrAutoritatiiEmise = nrAutoritatiiEmise;
    }

    public int getNrAngajati() {
        return nrAngajati;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void emiteAutorizatie(String numePersoana){
        this.nrAutoritatiiEmise ++;
        System.out.println("A fost emisa autorizatia de pescuit cu nr"+ nrAutoritatiiEmise+".pentru  " +numePersoana+".");
    }

    public void angajeaza(Integer nrAngajati){
        this.nrAngajati += nrAngajati;
    }

    public void concediaza(Integer nrAngajati){
        this.nrAngajati -= nrAngajati;
    }

    @Override
    public String toString() {
        return "AutoritatePescuitEager{" +
                "denumire='" + denumire + '\'' +
                ", website='" + website + '\'' +
                ", nrAngajati=" + nrAngajati +
                ", nrAutoritatiiEmise=" + nrAutoritatiiEmise +
                '}';
    }
}
