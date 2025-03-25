package Main;

import Clase.AutoritatePescuit;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        AutoritatePescuit autoritatePescuit = AutoritatePescuit.getInstance("ANPA","anpc.ro",10,new HashMap<>());

        autoritatePescuit.emiteAutorizatie("Iulian");
        autoritatePescuit.emiteAutorizatie("Iulian");

        System.out.println(autoritatePescuit);

        AutoritatePescuit autoritatePescuit1= AutoritatePescuit.getInstance("ANNPA","annpc.com",100,new HashMap<>());
        autoritatePescuit1.emiteAutorizatie("Iulian");
        autoritatePescuit1.emiteAutorizatie("Georgian");

        System.out.println(autoritatePescuit1);
        System.out.println(autoritatePescuit);

    }
}