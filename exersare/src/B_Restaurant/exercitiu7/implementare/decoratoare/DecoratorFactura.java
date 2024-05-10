package B_Restaurant.exercitiu7.implementare.decoratoare;

import B_Restaurant.exercitiu7.implementare.clase.FacturaAbstract;

public abstract class DecoratorFactura extends FacturaAbstract {
    private FacturaAbstract factura;
    public DecoratorFactura(int numarFactura, double valoareFactura) {
        super(numarFactura, valoareFactura);
    }

    public DecoratorFactura(FacturaAbstract factura) {
        super(factura.getNumarFactura(),
                factura.getValoareFactura());
        this.factura = factura;
    }

    public FacturaAbstract getFactura() {
        return factura;
    }

    public abstract void afiseazaMesajAditional();
}
