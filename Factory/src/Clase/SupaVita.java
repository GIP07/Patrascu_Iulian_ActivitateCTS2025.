package Clase;

public class SupaVita extends Supa {

    public double pretSmantana;

    public SupaVita(int gramaj, double pretPerSutaGrame, String ingrediente, double pretSmantana) {
        super(gramaj, pretPerSutaGrame, ingrediente);
        this.pretSmantana = pretSmantana;
    }

    public double calculeazaPret(){
        return super.calculeazaPret() + pretSmantana;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa de vita cu extra smantana este gata si costa "+pretSmantana);
    }
}
