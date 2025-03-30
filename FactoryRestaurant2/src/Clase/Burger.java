package Clase;

public class Burger implements IPreparat{

private int idBurger;
private String denumireBurger;
private String tipCarne;

    public Burger(int idBurger, String denumireBurger, String tipCarne) {
        this.idBurger = idBurger;
        this.denumireBurger = denumireBurger;
        this.tipCarne = tipCarne;
    }

    public int getIdBurger() {
        return idBurger;
    }

    @Override
    public int getId() {
        return getIdBurger();
    }

    @Override
    public String getDenumire() {
        return this.denumireBurger;
    }

    @Override
    public void afisarePreparat() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Burger{" +
                "idBurger=" + idBurger +
                ", denumireBurger='" + denumireBurger + '\'' +
                ", tipCarne='" + tipCarne + '\'' +
                '}';
    }
}
