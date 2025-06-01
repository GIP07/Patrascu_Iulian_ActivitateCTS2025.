package Decorator;

import Clase.IPachetTuristic;
import Clase.PachetCazare;

public class OfertaPachetCazare extends IOfertaPachetTuristic{

    public OfertaPachetCazare(IPachetTuristic pachetTuristic) {
        super(pachetTuristic);
    }
    @Override
    public void anulareRezervare() {
        System.out.println("Rezervarea de cazare a fost anulata!");
    }

    @Override
    public void descriere() {

    }
}
