package Fabrica;

import Clase.Supa;
import Clase.SupaCiuperci;
import Clase.SupaLegume;
import Clase.SupaVita;

public class Factory {

    private int gramaj;
    private double pretPerSutaGrame;

    public Factory(int gramaj, double pretPerSutaGrame) {
        this.gramaj = gramaj;
        this.pretPerSutaGrame = pretPerSutaGrame;
    }

    public Supa getSupa (TipSupa tip, String ingrediente, double extraSupa) {
        return switch (tip){
            case CIUPERCI -> new SupaCiuperci(gramaj,pretPerSutaGrame,ingrediente,extraSupa);
            case LEGUME ->  new SupaLegume(gramaj, pretPerSutaGrame,ingrediente,extraSupa);
            case VITA -> new SupaVita(gramaj, pretPerSutaGrame,ingrediente,extraSupa);
            default -> null;
        };
    }
}
