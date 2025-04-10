package Factory;

import Functii.Banner;
import Functii.Flyer;
import Functii.IReclama;
import Functii.Sticker;

public class Factory {

    public IReclama getReclama(TipProdus tipProdus ,String numeProdusPromovat,String orasPromovare, int latime, int inaltime){
       return switch(tipProdus){
           case BANNER -> new Banner(numeProdusPromovat,100,150,numeProdusPromovat);
           case STICKER -> new Sticker(numeProdusPromovat,50 ,90,numeProdusPromovat);
           case FLYER -> new Flyer(numeProdusPromovat,12,31,numeProdusPromovat);
           default -> null;
       };
    }
}
