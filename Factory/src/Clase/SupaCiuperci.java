package Clase;

public class SupaCiuperci extends Supa {

    private double cantitateCiuperci;

    public SupaCiuperci(int gramaj, double pretPerSutaGrame, String ingrediente, double cantitateCiuperci) {
        super(gramaj, pretPerSutaGrame, ingrediente);
        this.cantitateCiuperci = cantitateCiuperci;
    }
    @Override

    public void preparareSupa() {
        System.out.println("Supa de ciuperci cu " + cantitateCiuperci + "grame ciuperci este gata!");
    }

    public double calculeazaPret(){
        return calculeazaPret() * super.calculeazaPret() * (cantitateCiuperci / 100);
    }
}
