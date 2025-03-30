package Clase;

public class Burger implements IProdus {

    public int idBurger;
    private String denumire;
    private int nrChifle;

    public Burger(int idBurger, String denumire, int nrChifle) {
        this.idBurger = idBurger;
        this.denumire = denumire;
        this.nrChifle = nrChifle;
    }

    public int getIdBurger(){
        return this.idBurger;
    }

    @Override
    public String getDenumireProdus() {
        return this.denumire;
    }

    @Override
    public void getDescriere() {
        System.out.println(this.toString());
    }

    @Override
    public int getID() {
        return getIdBurger();
    }

    @Override
    public String toString() {
        return "Burger{" +
                "idBurger=" + idBurger +
                ", denumire='" + denumire + '\'' +
                ", nrChifle=" + nrChifle +
                '}';
    }
}
