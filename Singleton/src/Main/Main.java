package Main;

import Clase.AutoritatePescuitEager;

public class Main {
    public static void main(String[] args) {
        AutoritatePescuitEager autoritatePescuitEager = AutoritatePescuitEager.getInstance();

        System.out.println(autoritatePescuitEager.toString());

        autoritatePescuitEager.concediaza(5);
        System.out.println(autoritatePescuitEager.toString());

        autoritatePescuitEager.setDenumire("ANCP");
        autoritatePescuitEager.setWebsite("anpc.ro");
        System.out.println(autoritatePescuitEager.toString());

        autoritatePescuitEager.emiteAutorizatie("Patrascu Iulian");
        System.out.println(autoritatePescuitEager);

        AutoritatePescuitEager  autoritatePescuitEager2 = AutoritatePescuitEager.getInstance();
        autoritatePescuitEager2.emiteAutorizatie("Patrascu Iulian Georgian");
        System.out.println(autoritatePescuitEager2);

    }
}