package Clase;

public abstract class Supa {

    private int gramaj;
    private double pretPerSutaGrame;
    private String ingrediente;

    public Supa(int gramaj, double pretPerSutaGrame, String ingrediente) {
        this.gramaj = gramaj;
        this.pretPerSutaGrame = pretPerSutaGrame;
        this.ingrediente = ingrediente;
    }

    public double getPretPerSutaGrame() {
        return pretPerSutaGrame;
    }

    public abstract void preparareSupa();

    public double calculeazaPret(){
        return this.gramaj / 100 * this.pretPerSutaGrame / 100;
    }
}
