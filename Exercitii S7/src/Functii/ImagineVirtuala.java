package Functii;

import java.util.List;

public class ImagineVirtuala implements IImagineVirtuala {

    private String numeImagine;
    private int inaltimeImagine;
    private int latimeImagine;
    private String aplicatieNecesaraImagine;

    public ImagineVirtuala(String numeImagine, int inaltimeImagine, int latimeImagine, String aplicatieNecesaraImagine) {
        this.numeImagine = numeImagine;
        this.inaltimeImagine = inaltimeImagine;
        this.latimeImagine = latimeImagine;
        this.aplicatieNecesaraImagine = aplicatieNecesaraImagine;
    }

    public ImagineVirtuala() {

    }

    public ImagineVirtuala copiereImagineVirtuala () {
        ImagineVirtuala imagineVirtuala = new ImagineVirtuala();
        imagineVirtuala.numeImagine = this.numeImagine;
        imagineVirtuala.inaltimeImagine=this.inaltimeImagine;
        imagineVirtuala.latimeImagine = this.latimeImagine;
        imagineVirtuala.aplicatieNecesaraImagine = this.aplicatieNecesaraImagine;
        return imagineVirtuala;
    }

    @Override
    public List<String> getAplicatiiInstalate() {
        return List.of();
    }

    @Override
    public void afiseazaDescriereImagineVirtuala() {
        System.out.println("Imagine Virtuala cu dimensiunile: " + latimeImagine + " x "+ inaltimeImagine + "are nevoie de aplicatia " + aplicatieNecesaraImagine);
    }

    @Override
    public void instaleazaAplicatie(String numeAplicatie) {

    }
}
