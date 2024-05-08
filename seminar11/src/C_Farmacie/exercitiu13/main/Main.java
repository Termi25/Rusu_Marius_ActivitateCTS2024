package C_Farmacie.exercitiu13.main;

import C_Farmacie.exercitiu13.implementare.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta1=new Reteta(123456789,6);
        System.out.println(reteta1);

        reteta1.solicitaMedicamente();
        System.out.println(reteta1);

        reteta1.respingeReteta();
        reteta1.cumparaMedicamente();

        reteta1.solicitaMedicamente();
        reteta1.cumparaMedicamente();
    }
}