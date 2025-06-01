package Main;

import Strategy.Client;
import Strategy.LivrarePremium;
import Strategy.LivrareRapida;
import Strategy.LivrareStandard;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Mircea",new LivrarePremium(),200);
        Client client2 = new Client("Marius",new LivrareRapida(),140);
        Client client3 = new Client("Maria",new LivrareStandard(),100);

        System.out.println(client1.getCostTotal());
        System.out.println(client2.getCostTotal());
        System.out.println(client3.getCostTotal());
    }
}