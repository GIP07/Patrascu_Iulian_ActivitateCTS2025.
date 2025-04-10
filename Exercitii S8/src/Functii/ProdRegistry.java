package Functii;

import java.util.HashMap;
import java.util.Map;

public class ProdRegistry {

    private static final ProdRegistry instance = new ProdRegistry();
    private ProdRegistry() {}; // constructor fara parametrii privat

    private static Map<String,IProdusGeneric> produse = new HashMap<>();

    public static ProdRegistry getInstance() {
        return instance;
    }

    public void adaugaProdus(String numeProdus, int stoc) {

        if(produse.containsKey(numeProdus)) {
            produse.get(numeProdus).cresteStoc(stoc);
    } else{
            Produs prodNou = new Produs(numeProdus, stoc);
            produse.put(numeProdus , prodNou);
        }
    }

    public void afisaProdus() {
        for(IProdusGeneric prod : produse.values()) {
         prod.afiseazaDescriereProdus();
        }
    }

    public IProdusGeneric getProdus(String numeProdus) {
        return produse.get(numeProdus);
    }

}
