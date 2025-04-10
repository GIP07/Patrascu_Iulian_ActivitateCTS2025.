package Factory;

import Functii.Brosura;
import Functii.Flyer;
import Functii.IProdusMarketing;
import Functii.Poster;

public class ProdusMarketingFactory {

    public static IProdusMarketing getProdusMarketing(TipProdus tip, String client,String domeniu, int latime, int inaltime){
        return switch(tip){
            case POSTER -> new Poster(client,domeniu,latime,inaltime);
            case FLYER -> new Flyer(client,domeniu,latime,inaltime);
            case BROSURA -> new Brosura(client,domeniu,latime,inaltime);
            default -> null;
        };
    }
}
