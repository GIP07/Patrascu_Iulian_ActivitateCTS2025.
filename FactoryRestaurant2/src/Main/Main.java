package Main;


import Clase.ETipPreparat;
import Clase.FabricaPreparate;
import Clase.IPreparat;

public class Main {
    public static void main(String[] args) {

        FabricaPreparate fabricaPreparate = FabricaPreparate.getInstance(2);
        IPreparat preparat1 = null;
        IPreparat preparat2 = null;
        IPreparat preparat3 = null;
        IPreparat preparat6 = null;

        try {
            preparat1 = fabricaPreparate.crearePreparat(ETipPreparat.BURGER,12,"Burger Bun");
            preparat2 = fabricaPreparate.crearePreparat(ETipPreparat.BURGER,2,"Burger 2");
            preparat3 = fabricaPreparate.crearePreparat(ETipPreparat.BURGER,13,"Burger Extra");
            preparat1.afisarePreparat();
            preparat2.afisarePreparat();
        } catch (Exception e) {
            System.out.println("Obiectele nu au putut fi crate");
        }

        FabricaPreparate fabricaPreparate2 = FabricaPreparate.getInstance(7);

        try {
            preparat6 = fabricaPreparate.crearePreparat(ETipPreparat.BURGER,12,"Burger Bun");
            preparat6.afisarePreparat();

        } catch (Exception e) {
            System.out.println("Obiectele nu au putut fi crate");
        }
    }
}