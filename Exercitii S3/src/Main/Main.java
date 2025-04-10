package Main;


import Factory.ProdusMarketingFactory;
import Factory.TipProdus;
import Functii.Banner;
import Functii.BannerRegistry;
import Functii.IProdusMarketing;

public class Main {
    public static void main(String[] args) {

        BannerRegistry registry = BannerRegistry.getInstance();

        IProdusMarketing poster1 = ProdusMarketingFactory.getProdusMarketing(TipProdus.POSTER, "Client A","Auto", 30,60);
        IProdusMarketing brosura1 = ProdusMarketingFactory.getProdusMarketing(TipProdus.BROSURA, "Client B","Auto", 12,20);
        IProdusMarketing flyer1 = ProdusMarketingFactory.getProdusMarketing(TipProdus.FLYER, "Client F","Auto", 10,20);

        IProdusMarketing b1 = registry.getCreateBanner("IT","Client1", 100,200);
        IProdusMarketing b2 = registry.getCreateBanner("Hr","Client2", 100,200);
        IProdusMarketing b3 = registry.getCreateBanner("IT","Client3", 20,10);

        poster1.creareProdus();
        brosura1.creareProdus();
        flyer1.creareProdus();

        b1.creareProdus();
        b2.creareProdus();
        b3.creareProdus();
    }
}