package Functii;

public class Reclama implements IReclama{
    private String numeProdusPromovat;
    private int latime;;
    private int inaltime;
    private String orasPromovare;

    public Reclama(String numeProdusPromovat, int latime, int inaltime, String orasPromovare) {
        this.numeProdusPromovat = numeProdusPromovat;
        this.latime = latime;
        this.inaltime = inaltime;
        this.orasPromovare = orasPromovare;
    }
    public Reclama() {

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

    }
}
