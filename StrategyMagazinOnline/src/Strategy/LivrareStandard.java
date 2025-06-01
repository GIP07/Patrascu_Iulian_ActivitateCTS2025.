package Strategy;

public class LivrareStandard implements ILivrare {
    private int cost=15;
    @Override
    public void livrare() {
        System.out.println("Livrarea Standard a fost selectata. Pret " + cost +" lei");
    }

    @Override
    public int getCost() {
        return 0;
    }
}
