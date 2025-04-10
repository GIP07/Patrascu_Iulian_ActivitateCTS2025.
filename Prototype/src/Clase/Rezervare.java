package Clase;

public class Rezervare extends ARezervare{

    public Rezervare(String numeClient, int nrPersoane, String data, String ora) {
        super(numeClient, nrPersoane, data, ora);
    }
    public Rezervare() {
        super();
    }

    public void descriere(){
        System.out.println("Rezervarea pentru "+numeClient+",numar persoane "+nrPersoane+", pe data de "+data+" la ora "+ora);
    }
    public ARezervare copiaza(){
        Rezervare rezervareNoua = new Rezervare();
        rezervareNoua.data = this.data;
        rezervareNoua.numeClient = this.numeClient;
        rezervareNoua.nrPersoane = this.nrPersoane;
        rezervareNoua.ora = this.ora;

        return rezervareNoua;
    }
}
