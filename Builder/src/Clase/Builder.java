package Clase;

public class Builder implements IBuilder {

    private Pacient pacient;

    public Builder(String numePacient) {
        this.pacient = new Pacient(numePacient, false, false, false, false, "Alt pacient");
    }

    public Builder arePatRabatabil(boolean arePatRabatabil) {

        this.pacient.setArePatRabatabil(arePatRabatabil);
        return this;
    }
    public Builder areMicDejun(boolean areMicDejun) {

        this.pacient.setArePatRabatabil(areMicDejun);
        return this;

    }
    public Builder arePapuciDeCamera(boolean arePapuciDeCamera) {

        this.pacient.setArePapuciDeCamera(arePapuciDeCamera);
        return this;

    }
    public Builder halatInterior(boolean halatInterior) {

        this.pacient.setHalatInterior(halatInterior);
        return this;
    }


    @Override
    public Pacient getPacient() {
       return this.pacient;
    }
}
