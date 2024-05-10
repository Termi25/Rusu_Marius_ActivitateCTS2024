package B_Restaurant.exercitiu7.implementare.clase;

public abstract class FacturaAbstract {
    int numarFactura;
    double valoareFactura;

    public FacturaAbstract(int numarFactura, double valoareFactura) {
        this.numarFactura = numarFactura;
        this.valoareFactura = valoareFactura;
    }

    public int getNumarFactura() {
        return numarFactura;
    }

    public double getValoareFactura() {
        return valoareFactura;
    }

    @Override
    public String toString() {
        return "FacturaAbstract{" +
                "numarFactura=" + numarFactura +
                ", valoareFactura=" + valoareFactura +
                '}';
    }

    public abstract void printeazaFactura();
}
