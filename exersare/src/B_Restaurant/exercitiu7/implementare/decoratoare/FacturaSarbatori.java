package B_Restaurant.exercitiu7.implementare.decoratoare;

import B_Restaurant.exercitiu7.implementare.clase.FacturaAbstract;

public class FacturaSarbatori extends DecoratorFactura{
    public FacturaSarbatori(FacturaAbstract factura) {
        super(factura);
    }

    public FacturaSarbatori(int numarFactura, double valoareFactura) {
        super(numarFactura, valoareFactura);
    }

    @Override
    public void printeazaFactura() {
        afiseazaMesajAditional();
    }

    @Override
    public void afiseazaMesajAditional() {
        this.getFactura().printeazaFactura();
        System.out.println("La multi ani!");
    }
}
