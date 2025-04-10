package Factory;

import Functii.IProdusGeneric;
import Functii.ProdusBio;
import Functii.ProdusElectronic;
import Functii.ProdusPerisabil;

public class Factory {

    public IProdusGeneric getProdus(TipProdus tipProdus, String numeProdus, float stoc) {
        return switch (tipProdus){
            case BIO -> new ProdusBio(numeProdus, stoc);
            case PERISABIL -> new ProdusPerisabil(numeProdus, stoc);
            case ELECTRONIC -> new ProdusElectronic(numeProdus, stoc);
            default -> null;
        };
    }
}
