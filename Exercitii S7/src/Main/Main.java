package Main;

import Functii.ImagineRegistry;
import Functii.ImagineVirtuala;
import Functii.ImagineVirtualaBuilder;

public class Main {

    public static void main(String[] args) {

        ImagineVirtuala imagineVirtuala = new ImagineVirtuala("Imagine1",130,120,"Snapchat");
        ImagineVirtuala imagineVirtuala1 = imagineVirtuala.copiereImagineVirtuala();

        imagineVirtuala.afiseazaDescriereImagineVirtuala();
        imagineVirtuala1.afiseazaDescriereImagineVirtuala();

        ImagineVirtualaBuilder imagine1 = new ImagineVirtualaBuilder.Builder().adaugaAplcatie("Word").adaugaAplcatie("Paint").adaugaAplcatie("Opera").build();
        ImagineVirtualaBuilder imagine2 = new ImagineVirtualaBuilder.Builder().adaugaAplcatie("Note").build();
        ImagineVirtualaBuilder imagine3 = new ImagineVirtualaBuilder.Builder().adaugaAplcatie("PowerPoint").build();


        ImagineRegistry registru = ImagineRegistry.getInstance();

    }
}