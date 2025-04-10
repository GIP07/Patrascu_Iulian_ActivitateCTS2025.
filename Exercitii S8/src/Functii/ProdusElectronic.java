package Functii;

public class ProdusElectronic implements IProdusGeneric {

    private String numeProdus;
    private float stoc;

    public ProdusElectronic(String numeProdus, float stoc) {
        this.numeProdus = numeProdus;
        this.stoc = stoc;
    }
    public ProdusElectronic() {

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
    public void cresteStoc(int nrProduse) {

    }

    @Override
    public void afiseazaDescriereProdus() {
        System.out.println( "Nume produs: " + numeProdus +" stoc: " + stoc );
    }
}
