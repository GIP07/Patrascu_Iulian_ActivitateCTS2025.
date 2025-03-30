package Clase;

public class Pizza implements IPreparat{

    private int idPizza;
    private String denumirePizza;
    private int diametruPizza;
    private boolean areCarne;

    public Pizza(int idPizza, String denumirePizza, int diametruPizza, boolean areCarne) {
        this.idPizza = idPizza;
        this.denumirePizza = denumirePizza;
        this.diametruPizza = diametruPizza;
        this.areCarne = areCarne;
    }

    public int getIdPizza() {
        return idPizza;
    }

    @Override
    public int getId() {
        return getIdPizza();
    }

    @Override
    public String getDenumire() {
        return this.denumirePizza;
    }

    @Override
    public void afisarePreparat() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "idPizza=" + idPizza +
                ", denumirePizza='" + denumirePizza + '\'' +
                ", diametruPizza=" + diametruPizza +
                ", areCarne=" + areCarne +
                '}';
    }
}
