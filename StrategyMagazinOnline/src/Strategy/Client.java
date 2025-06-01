package Strategy;

public class Client {

    private String nume;
    private ILivrare tipLivrare;
    private double costComanda;

    public Client(String nume, ILivrare tipLivrare, double costComanda) {
        this.nume = nume;
        this.tipLivrare = tipLivrare;
        this.costComanda = costComanda;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public ILivrare getTipLivrare() {
        return tipLivrare;
    }

    public void setTipLivrare(ILivrare tipLivrare) {
        this.tipLivrare = tipLivrare;
    }

    public double getCostComanda() {
        return costComanda;
    }

    public void setCostComanda(double costComanda) {
        this.costComanda = costComanda;
    }

public double getCostTotal() {
        return costComanda + tipLivrare.getCost();

}
    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", tipLivrare=" + tipLivrare +
                ", costComanda=" + costComanda +
                '}';
    }
}
