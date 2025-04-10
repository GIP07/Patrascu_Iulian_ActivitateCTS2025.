package Functii;

public class Banner implements IProdusMarketing{

    private String numeClient;
    private String domeniuActivitate;
    private int latime;
    private int inaltime;

    public Banner(String numeClient, String domeniuActivitate, int latime, int inaltime) {
        this.numeClient = numeClient;
        this.domeniuActivitate = domeniuActivitate;
        this.latime = latime;
        this.inaltime = inaltime;
    }

    @Override
    public String getNumeClient() {
        return numeClient;
    }

    @Override
    public String getDomeniuActivitate() {
        return domeniuActivitate;
    }

    @Override
    public int getLatime() {
        return latime;
    }

    @Override
    public int getInaltime() {
        return inaltime;
    }

    public void creareProdus(){
        System.out.printf("Bannerul pentru clienul "+ numeClient + " din domeniul "+ domeniuActivitate +" cu dimensiunile " + latime + " x " + inaltime +" este gata! \n" );
    }
}
