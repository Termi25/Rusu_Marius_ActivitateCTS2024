package B_Restaurant.exercitiu7.main;

import B_Restaurant.exercitiu7.implementare.clase.Factura;
import B_Restaurant.exercitiu7.implementare.clase.FacturaAbstract;
import B_Restaurant.exercitiu7.implementare.decoratoare.FacturaSarbatori;

public class Main {
    public static void main(String[] args) {
        FacturaAbstract factura=new Factura(1,20.0);
        FacturaAbstract facturaModificata=new FacturaSarbatori(factura);
        facturaModificata.printeazaFactura();
    }
}
