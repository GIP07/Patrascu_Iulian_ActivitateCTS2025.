package Program;

import Strategy.Card;
import Strategy.Cash;
import Strategy.Client;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Patrascu");

        client.setModPlata(new Card());
        client.plateste(300);

        client.setModPlata(new Cash());
        client.plateste(30);

    }
}
