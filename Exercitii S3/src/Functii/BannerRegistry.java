package Functii;

import java.util.HashMap;
import java.util.Map;

public class BannerRegistry {

    private static BannerRegistry instance;
    private Map< String, Banner> bannere;

    public BannerRegistry() {
        bannere = new HashMap<>();
    }

    public static synchronized BannerRegistry getInstance() {
        if(instance == null){
            instance = new BannerRegistry();
        }
        return instance;
    }

    public Banner getCreateBanner(String domeniu, String numeClient, int inaltime, int latime){
        if(bannere.containsKey(domeniu)){
            System.out.println("Bannerul pentru domeniul " + domeniu + " exista deja");
            return bannere.get(domeniu);
        }else{
            Banner banner = new Banner(domeniu, numeClient, inaltime, latime);
            bannere.put(domeniu, banner);
            System.out.println("S-a creat un nou banner pentru domeniul " + domeniu);
            return banner;
        }
    }
}
