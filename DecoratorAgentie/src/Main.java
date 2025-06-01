import Clase.IPachetTuristic;
import Clase.PachetCazare;
import Decorator.IOfertaPachetTuristic;
import Decorator.OfertaPachetCazare;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        IPachetTuristic pachetTuristic = new PachetCazare();
        pachetTuristic.descriere();
        System.out.printf("Acest pachet nu poate fi anulat");
        System.out.println();

        IOfertaPachetTuristic ofertaPachetTuristic = new OfertaPachetCazare(pachetTuristic);
        pachetTuristic.descriere();
        System.out.println("Acest pachet nu poate fi oferta");

    }
}