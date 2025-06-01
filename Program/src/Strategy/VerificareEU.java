package Strategy;

public class VerificareEU implements ModVerificare{
    @Override
    public void verificareActe(String nume) {
        System.out.println("Am verificat viza lui" + nume);
    }
}
