package Clase;

public class Factory implements IFactory {

    private static Factory instance = new Factory();
    private int contor;
    private int nrMaxProduse;

    public Factory() {
        this.contor = 0;
        this.nrMaxProduse = 0;
    }

    private void setNrMaxProduse(int nrMaxProduse) {
        this.nrMaxProduse = nrMaxProduse;
    }

    public static Factory getInstance(int maxProduse) {
        instance.setNrMaxProduse(maxProduse);
        return instance;
    }

    @Override
    public IProdus creareProdus(TipProdus tipProdus, String denumireProdus) {
        if(this.nrMaxProduse <= this.contor){
            return null;
        }else {
            int id=this.contor+100;
            this.contor++;
        }
        switch (tipProdus){
            case PIZZA-> {
                return new Pizza(1,denumireProdus,null);
            }
            case BURGER -> {
                return new Burger(1,denumireProdus,2);
            }
            default -> {
                return null;
            }
        }
    }
}
