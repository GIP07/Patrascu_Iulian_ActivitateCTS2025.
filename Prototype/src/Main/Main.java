package Main;


import Clase.ARezervare;
import Clase.Rezervare;

public class Main {
    public static void main(String[] args) {

       ARezervare rezervare = new Rezervare("Patrascu Iulian",2,"07.04.2025","20:30");

       ARezervare rezervare1 = rezervare.copiaza();
       rezervare1.setOra("19:30");

       rezervare.descriere();
       rezervare1.descriere();
    }
}