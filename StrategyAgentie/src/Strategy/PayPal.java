package Strategy;

public class PayPal implements IModPlata{
    @Override
    public void plateste(String numeClient, double sumaPlatita) {
        System.out.println(numeClient + " plateste cu PayPal sume de " + sumaPlatita + " lei");
    }
}
