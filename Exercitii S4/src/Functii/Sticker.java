package Functii;

public class Sticker implements IReclama{

    private String numeProdusPromovat;
    private int latime;
    private int inaltime;
    private String orasPromovare;

    public Sticker(String numeProdusPromovat, int latime, int inaltime, String orasPromovare) {
        this.numeProdusPromovat = numeProdusPromovat;
        this.latime = latime;
        this.inaltime = inaltime;
        this.orasPromovare = orasPromovare;
    }

    public String getNumeProdusPromovat() {
        return numeProdusPromovat;
    }

    public int getLatime() {
        return latime;
    }

    public int getInaltime() {
        return inaltime;
    }

    public String getOrasPromovare() {
        return orasPromovare;
    }

    @Override
    public void creareProdusPromovat() {
        System.out.printf("Stickerele pentru produsul " + numeProdusPromovat + " are dimensiunile " + latime + " x " + inaltime + " si sunt promovate in orasul "+ orasPromovare  +"\n");
    }
}
