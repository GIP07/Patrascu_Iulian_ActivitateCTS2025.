package Clase;

import java.util.ArrayList;
import java.util.List;

public class FabricaPreparate {

    private static FabricaPreparate instance;
    private List<Integer> listaId;
    private int nrMaximPreparate;

    private FabricaPreparate(int nrMaximPreparate) {
        this.nrMaximPreparate = nrMaximPreparate;
        listaId = new ArrayList<>();
    }
    public static synchronized FabricaPreparate getInstance(int nrMaximPreparate) {
        if(instance ==null){
            instance = new FabricaPreparate(nrMaximPreparate);
        }
        return instance;
    }

    public void setNrMaximPreparate(int nrMaximPreparate) {

        if(nrMaximPreparate >= this.nrMaximPreparate){
            this.nrMaximPreparate = nrMaximPreparate;
        }
    }

    private boolean existaId(int id){
        if(this.listaId.contains(id)){
            return true;
        }else {
            return false;
        }
    }

    public IPreparat crearePreparat(ETipPreparat tipPreparat, int id, String denumire) throws Exception{
        if(this.nrMaximPreparate>this.listaId.size()){
            if(!existaId(id)){
                this.listaId.add(id);
                switch (tipPreparat){
                    case PIZZA -> {
                        return new Pizza(id,denumire,0,false);
                    }
                    case BURGER -> {
                        return new Burger(id,denumire,"-");
                    }
                    default -> {
                        return null;
                    }
                }
            }
            throw new Exception();
        }
        throw new Exception("Am depasit limita de nr obiecte!");
    }
}


