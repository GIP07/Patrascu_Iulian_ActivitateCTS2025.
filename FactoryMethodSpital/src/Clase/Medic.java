package Clase;

public class Medic extends AbstractAngajat{

    private double spor;

    public Medic(double salariu, String numeAngajat, double spor) {
        super(salariu, numeAngajat);
        this.spor = spor;
    }
}
