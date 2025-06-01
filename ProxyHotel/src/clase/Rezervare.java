package clase;

public class Rezervare implements IRezervare {
    private int numarNopti;
    private int codRezervare;

    public Rezervare(int numarNopti, int codRezervare) {
        super();
        this.numarNopti = numarNopti;
        this.codRezervare = codRezervare;
    }

    public int getCodRezervare() {
        return codRezervare;
    }

    public int getNumarNopti() {
        return numarNopti;
    }

    public void setNumarNopti(int numarNopti) {
        this.numarNopti = numarNopti;
    }

    public void setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
    }

    public void anulareRezervare() {
        System.out.println("Rezervare cu codul " + codRezervare + "a fost anulat.");
    }

}
