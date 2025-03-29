package Main;

import Clase.Pacient;
import Clase.PacientBuilder;

public class Main {
    public static void main(String[] args) {

      PacientBuilder pacient = new PacientBuilder();
        pacient.setNumeInsotitor("Marius").setArePatRabatabil(true).setHalatInterior(true);

      PacientBuilder pacient2 = new PacientBuilder();
      pacient2.setNumeInsotitor("Stefan").setArePatRabatabil(true).setHalatInterior(true);

        System.out.println(pacient);

    }
}