package Functii;

public class Brosura implements IProdusMarketing {

    private String numeClient;
    private String domeniuActivitate;
    private int latime;
    private int inaltime;

    public Brosura(String numeClient, String domeniuActivitate, int latime, int inaltime) {
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

    @Override
    public void creareProdus() {
        System.out.printf("Brosura pentru clientul " + numeClient + " " + domeniuActivitate + " " + latime + " " + inaltime+ "\n");
    }
}
