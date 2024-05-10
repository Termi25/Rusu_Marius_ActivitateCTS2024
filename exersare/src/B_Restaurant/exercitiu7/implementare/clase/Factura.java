package B_Restaurant.exercitiu7.implementare.clase;

public class Factura extends FacturaAbstract {

    public Factura(int numarFactura, double valoareFactura) {
        super(numarFactura, valoareFactura);
    }

    @Override
    public void printeazaFactura() {
        System.out.println("Factura cu numarul "
                +this.getNumarFactura()+", in valoare de "
                +this.getValoareFactura()+", a fost platita.");
    }
}
