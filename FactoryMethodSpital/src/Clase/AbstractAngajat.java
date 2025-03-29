package Clase;

public abstract class AbstractAngajat {

    String numeAngajat;
    private double salariu;


    public AbstractAngajat(double salariu, String numeAngajat) {
        this.salariu = salariu;
        this.numeAngajat = numeAngajat;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    public void setNumeAngajat(String numeAngajat) {
        this.numeAngajat = numeAngajat;
    }

    @Override
    public String toString() {
        return "AbstractAngajat{" +
                "numeAngajat='" + numeAngajat + '\'' +
                ", salariu=" + salariu +
                '}';
    }
}
