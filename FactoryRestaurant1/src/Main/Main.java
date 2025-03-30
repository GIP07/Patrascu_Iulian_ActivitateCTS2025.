package Main;

import Clase.Factory;
import Clase.IFactory;
import Clase.IProdus;
import Clase.TipProdus;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        IFactory factoryProd = Factory.getInstance(10);
        IProdus p1 = factoryProd.creareProdus(TipProdus.PIZZA,"Pizza buna");
        IProdus p2 = factoryProd.creareProdus(TipProdus.BURGER,"Burger");
        IProdus p3 = factoryProd.creareProdus(TipProdus.PIZZA,"Pizza casei");

        p1.getDescriere();
        p2.getDescriere();
        p3.getDescriere();
        }
    }
