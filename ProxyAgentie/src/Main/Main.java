package Main;

import Clase.PachetTransport;
import Clase.Persoana;
import Clase.ProxyPachet;

public class Main {
    public static void main(String[] args) {
        Persoana persoana = new Persoana("Patrascu", 55);
        PachetTransport pachetTransport = new PachetTransport(persoana);
        pachetTransport.rezervaPachet();

        ProxyPachet pachetTransportProxy = new ProxyPachet(persoana);
        pachetTransportProxy.rezervaPachet();
    }
}
