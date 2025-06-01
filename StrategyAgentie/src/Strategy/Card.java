package Strategy;

public class Card implements IModPlata{
    @Override
    public void plateste(String numeClient, double sumaPlatita) {
        System.out.println(numeClient + " plateste cu cardul suma de " + sumaPlatita + " lei");
    }
}
