package Main;


import Factory.Factory;
import Functii.Banner;
import Functii.IReclama;
import Factory.TipProdus;

public class Main {
    public static void main(String[] args) {

        Factory factory = new Factory();

        IReclama reclamaBanner = factory.getReclama(TipProdus.BANNER,"Produs1","Brasov", 100, 300);
        IReclama reclamaFlyer = factory.getReclama(TipProdus.FLYER,"Produs2","Bucuresti", 100, 300);
        IReclama reclamaSticker = factory.getReclama(TipProdus.STICKER, "Produs 3","Ploiesti", 10,10);

        reclamaFlyer.creareProdusPromovat();
        reclamaBanner.creareProdusPromovat();
        reclamaSticker.creareProdusPromovat();

        Banner banner = new Banner("Banner1",100,200,"Brasov");
        Banner banner1 = (Banner) banner.copiereBanner();

        banner.creareProdusPromovat();
        banner1.creareProdusPromovat();


    }
}