package A_Spital.exercitiu11.main;

import A_Spital.exercitiu11.implementare.clase.Factura;
import A_Spital.exercitiu11.implementare.clase.FacturaAbstracta;
import A_Spital.exercitiu11.implementare.decoratoare.DecoratorFactura;
import A_Spital.exercitiu11.implementare.decoratoare.FacturaCash;

public class Main {
    public static void main(String[] args) {
        FacturaAbstracta factura1=new Factura("Manole",120.0);
        factura1.printareFactura();

        DecoratorFactura factura2=new FacturaCash(factura1);
        factura2.platesteFactura();
    }
}
