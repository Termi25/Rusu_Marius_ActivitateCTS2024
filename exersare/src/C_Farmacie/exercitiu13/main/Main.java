package C_Farmacie.exercitiu13.main;

import C_Farmacie.exercitiu13.implementare.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta=new Reteta(256,3);
        reteta.cereMedicamente();
        reteta.cumparaMedicamente();

        System.out.println();
        reteta.cereMedicamente();
    }
}
