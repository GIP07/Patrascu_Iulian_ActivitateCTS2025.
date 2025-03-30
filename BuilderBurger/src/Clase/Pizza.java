package Clase;

public class Pizza implements IProdus {

    public int idPizza;
    private String denumire;
    private String listaIngrediente;

    public Pizza(int idPizza, String denumire, String listaIngrediente) {
        this.idPizza = idPizza;
        this.denumire = denumire;
        this.listaIngrediente = listaIngrediente;
    }

    public int getIdPizza(){
        return idPizza;
    }

    public int getID() {
        return getIdPizza();
    }
    public String getDenumireProdus() {
        return this.denumire;
    }
    public void getDescriere() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "idPizza=" + idPizza +
                ", denumire='" + denumire + '\'' +
                ", listaIngrediente='" + listaIngrediente + '\'' +
                '}';
    }
}
