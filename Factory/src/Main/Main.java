package Main;

import Clase.Supa;
import Fabrica.Factory;
import Fabrica.TipSupa;

public class Main {
    public static void main(String[] args) {

    int gramajFabrica=200;
    double pretFabrica=9.5;

    Factory factory = new Factory(gramajFabrica, pretFabrica);

    Supa supaCiuperci = factory.getSupa(TipSupa.CIUPERCI,"Ciuperci, Apa, Sare, Piper", 15);
    Supa supaLegume = factory.getSupa(TipSupa.LEGUME, "Legume, Apa, Bors, Sare,Piper", 10);
    Supa supaVita = factory.getSupa(TipSupa.VITA, "Vita, Apa, Bors, Piper, Cartof", 22);

    supaCiuperci.preparareSupa();
    supaLegume.preparareSupa();
    supaVita.preparareSupa();
    }
}