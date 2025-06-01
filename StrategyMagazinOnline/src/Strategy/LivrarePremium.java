package Strategy;

public class LivrarePremium implements ILivrare{

   private int cost = 40;

    @Override
    public void livrare() {
        System.out.println("Livrarea Premium premium selectata. Pret" + cost + " lei.  ");
    }

    @Override
    public int getCost() {
        return cost;
    }
}
