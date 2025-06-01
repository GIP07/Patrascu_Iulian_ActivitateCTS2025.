import clase.ProxyRezervare;
import clase.Rezervare;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rezervare rezervare = new Rezervare(2,2205);
        rezervare.anulareRezervare();

        ProxyRezervare proxy = new ProxyRezervare(rezervare);
        proxy.anulareRezervare();
    }
}