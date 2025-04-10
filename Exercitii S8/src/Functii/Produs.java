package Functii;

public class Produs implements IProdusGeneric{

    private String numeProdus;
    private float stoc;

    public Produs(String numeProdus, float stoc) {
        this.numeProdus = numeProdus;
        this.stoc = stoc;
    }
    public Produs() {

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
        this.stoc+=nrProduse;
    }
}
