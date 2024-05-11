package C_Farmacie.exercitiu11.main;

import C_Farmacie.exercitiu11.implementare.FacturaFarmacie;
import C_Farmacie.exercitiu11.implementare.PlataCash;

public class Main {
    public static void main(String[] args) {
        FacturaFarmacie facturaFarmacie=new FacturaFarmacie(1,120.0);
        facturaFarmacie.platesteFacturaFarmacie();

        facturaFarmacie.setMetodaPlata(new PlataCash());
        facturaFarmacie.platesteFacturaFarmacie();
    }
}
