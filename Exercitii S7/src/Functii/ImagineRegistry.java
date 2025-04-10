package Functii;

import java.util.HashMap;
import java.util.Map;

public class ImagineRegistry {

    private static final ImagineRegistry instance = new ImagineRegistry();
    private Map<String,ImagineVirtuala> registru = new HashMap<>();

    private ImagineRegistry() {};

    public static ImagineRegistry getInstance(){
        return instance;
    }

    public void inregistreazaImagineVirtuala(String nume, ImagineVirtuala imagineVirtuala) {
        registru.put(nume, imagineVirtuala);
    }
    public ImagineVirtuala getImagineVirtuala(String nume){
        return registru.get(nume);
    }

    public void afiseazaToateImagineVirtuala() {
        for(Map.Entry<String,ImagineVirtuala> entry : registru.entrySet()){
            System.out.println("Imagine:" + entry.getKey());
            entry.getValue().afiseazaDescriereImagineVirtuala();
        }
    }
}
