package Clase;

public class Autorizatie {

    private int numar;
    private String detinator;
    private String data;

    public Autorizatie(int numar, String detinator, String data) {
        this.numar = numar;
        this.detinator = detinator;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Autorizatie{" +
                "numar=" + numar +
                ", detinator='" + detinator + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
