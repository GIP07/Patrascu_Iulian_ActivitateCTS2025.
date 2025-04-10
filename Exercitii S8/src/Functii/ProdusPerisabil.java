package Functii;

public class ProdusPerisabil implements IProdusGeneric {
        private String numeProdus;
        private float stoc;

    public ProdusPerisabil(String numeProdus, float stoc) {
        this.numeProdus = numeProdus;
        this.stoc = stoc;
    }
    public ProdusPerisabil() {

    }

    @Override
    public String getNumeProdus() {
        return numeProdus;
    }

    @Override
    public float getStoc() {
        return stoc;
    }

    @Override
    public void afiseazaDescriereProdus() {
        System.out.println( "Nume produs: " + numeProdus +" stoc: " + stoc );
    }

    @Override
    public void cresteStoc(int nrProduse) {

    }
}
