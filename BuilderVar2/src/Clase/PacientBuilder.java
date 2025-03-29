package Clase;

public class PacientBuilder {


    private boolean arePatRabatabil;
    private boolean areMicDejun;
    private boolean arePapuciDeCamera;
    private boolean halatInterior;
    private String numeInsotitor;



    public PacientBuilder() {
      this.arePatRabatabil = false;
      this.areMicDejun = false;
      this.arePapuciDeCamera = false;
      this.halatInterior = false;
      this.numeInsotitor = "Alt Pacient";
    }

    public PacientBuilder setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
        return this;
    }

    public PacientBuilder setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
        return this;
    }

    public PacientBuilder setArePapuciDeCamera(boolean arePapuciDeCamera) {
        this.arePapuciDeCamera = arePapuciDeCamera;
        return this;
    }

    public PacientBuilder setHalatInterior(boolean halatInterior) {
        this.halatInterior = halatInterior;
        return this;
    }
    public PacientBuilder setNumeInsotitor(String numeInsotitor) {
        this.numeInsotitor = numeInsotitor;
        return this;
    }

    @Override
    public String toString() {
        return "PacientBuilder{" +
                "arePatRabatabil=" + arePatRabatabil +
                ", areMicDejun=" + areMicDejun +
                ", arePapuciDeCamera=" + arePapuciDeCamera +
                ", halatInterior=" + halatInterior +
                ", numeInsotitor='" + numeInsotitor + '\'' +
                '}';
    }
}
