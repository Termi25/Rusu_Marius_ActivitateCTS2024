package C_farmacie.exercitiu3.main;

import C_farmacie.exercitiu3.implementare.Factura;

public class Main {
    public static void main(String[] args) {
        Factura factura=new Factura.RetetaBuilder(1234,12.99)
                .setCardFidelitate()
                .build();
        System.out.println(factura);
    }
}
