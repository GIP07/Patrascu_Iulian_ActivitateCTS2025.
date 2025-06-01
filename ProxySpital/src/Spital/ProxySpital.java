package Spital;

public class ProxySpital implements IPacient {

    private Pacient pacient;
    public ProxySpital(Pacient pacient) {
        this.pacient = pacient;
    }

    @Override
    public void intenare() {
        if(pacient.esteAsigurat()){
            pacient.intenare();
        }else{
            System.out.println("Pacientul cu numele " + pacient.getNume() + " nu este asigurat medical.");
        }
    }
}
