package Strategy;

public class VerificareAmericani implements ModVerificare {
    @Override
    public void verificareActe(String nume) {
        System.out.println("Am verificat viza lui" + nume);
    }
}
