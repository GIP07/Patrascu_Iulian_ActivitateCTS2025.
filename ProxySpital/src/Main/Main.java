package Main;


import Spital.Pacient;
import Spital.ProxySpital;

public class Main {
    public static void main(String[] args) {

        ProxySpital proxySpital = new ProxySpital(new Pacient("Mircea", true));
        proxySpital.intenare();

        ProxySpital proxySpital2 = new ProxySpital(new Pacient("Maria", false));
        proxySpital2.intenare();

        }
}