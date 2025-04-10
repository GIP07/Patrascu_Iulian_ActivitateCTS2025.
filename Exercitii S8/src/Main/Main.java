package Main;

import Factory.TipProdus;
import Factory.Factory;
import Functii.IProdusGeneric;
import Functii.ProdRegistry;

public class Main {
    public static void main(String[] args) {

        ProdRegistry registruProduse = ProdRegistry.getInstance();

        Factory fabricaProdus = new Factory();
        IProdusGeneric prodBio = fabricaProdus.getProdus(TipProdus.BIO,"Alune",100);
        IProdusGeneric prodElectronic = fabricaProdus.getProdus(TipProdus.ELECTRONIC,"Radio",4);
        IProdusGeneric prodPerisabil = fabricaProdus.getProdus(TipProdus.PERISABIL,"Farfurie", 10);

        prodBio.afiseazaDescriereProdus();
        prodElectronic.afiseazaDescriereProdus();
        prodPerisabil.afiseazaDescriereProdus();

        System.out.printf("\n\n");
        
        registruProduse.adaugaProdus("Laptop",10);
        registruProduse.adaugaProdus("Telefon",15);
        registruProduse.adaugaProdus("Laptop",2);
        registruProduse.adaugaProdus("Mouse",6);
        registruProduse.adaugaProdus("Mouse",7);

        registruProduse.afisaProdus();
    }
}