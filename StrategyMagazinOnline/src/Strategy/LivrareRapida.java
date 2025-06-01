package Strategy;

public class LivrareRapida implements ILivrare{
    private int cost = 80;
    @Override
    public void livrare() {
        System.out.println("Livrarea Rapida a fost selectata. Pret" + cost + " lei.  ");
    }

    @Override
    public int getCost() {
        return cost;
    }
}
