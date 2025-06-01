package Decorator;

import Clase.IPachetTuristic;

public abstract class IOfertaPachetTuristic implements IPachetTuristic {

    private IPachetTuristic pachetTuristic;

    public IOfertaPachetTuristic(IPachetTuristic pachetTuristic) {
        this.pachetTuristic = pachetTuristic;
    }

    public void descriere() {
        pachetTuristic.descriere();
    }

    public abstract void anulareRezervare();

}
