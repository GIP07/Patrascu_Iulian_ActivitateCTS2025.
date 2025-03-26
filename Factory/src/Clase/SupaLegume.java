package Clase;

public class SupaLegume extends Supa{

    private double gramajCrutoane;

    public SupaLegume(int gramaj, double pretPerSutaGrame, String ingrediente, double gramajCrutoane) {
        super(gramaj, pretPerSutaGrame, ingrediente);
        this.gramajCrutoane = gramajCrutoane;
    }

    public double calculeazaPret() {
        return super.calculeazaPret() * gramajCrutoane+ gramajCrutoane * super.calculeazaPret()*2/100;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de legume cu "+ gramajCrutoane + " grame crutoane este gata!");
    }
}
