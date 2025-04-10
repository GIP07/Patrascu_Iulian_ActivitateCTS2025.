package Functii;

public class Banner implements IReclama {

    private String numeProdusPromovat;
    private int latime;
    private int inaltime;
    private String orasPromovare;

    public Banner(String numeProdusPromovat, int latime, int inaltime, String orasPromovare) {
        this.numeProdusPromovat = numeProdusPromovat;
        this.latime = latime;
        this.inaltime = inaltime;
        this.orasPromovare = orasPromovare;
    }

    @Override
    public String getNumeProdusPromovat() {
        return numeProdusPromovat;
    }

    @Override
    public int getLatime() {
        return latime;
    }

    @Override
    public int getInaltime() {
        return inaltime;
    }

    @Override
    public String getOrasPromovare() {
        return orasPromovare;
    }

    @Override
    public void creareProdusPromovat() {
        System.out.printf("Bannerele pentru produsul " + numeProdusPromovat + " are dimensiunile " + latime + " x " + inaltime + " si sunt promovate in orasul "+ orasPromovare  +"\n");
    }
}
