package Spital;

public class Pacient implements IPacient {

    private String nume;
    private boolean asigurat;

    public Pacient(String nume, boolean asigurat) {
        this.nume = nume;
        this.asigurat = asigurat;
    }

    public boolean esteAsigurat() {
        return asigurat;
    }
    public String getNume() {
        return nume;
    }

    @Override
    public void intenare() {
        System.out.println("Pacientul " + nume + " a fost internat.");
    }
}
