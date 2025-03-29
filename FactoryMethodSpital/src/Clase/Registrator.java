package Clase;

public class Registrator extends AbstractAngajat{
    private int vechime;

    public Registrator(double salariu, String numeAngajat, int vechime) {
        super(salariu, numeAngajat);
        this.vechime = vechime;
    }
}
