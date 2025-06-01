package Strategy;

public class Cash implements IModPlata {
    @Override
    public void plateste(String numeClient, double sumaPlatita) {
        System.out.println(numeClient + " plateste cash suma de " + sumaPlatita + " lei");
    }
}
