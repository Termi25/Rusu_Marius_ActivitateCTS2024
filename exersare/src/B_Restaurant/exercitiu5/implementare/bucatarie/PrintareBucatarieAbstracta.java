package B_Restaurant.exercitiu5.implementare.bucatarie;

public abstract class PrintareBucatarieAbstracta {
    int numarFactura;
    double sumaPlata;

    public PrintareBucatarieAbstracta(int numarFactura, double sumaPlata) {
        this.numarFactura = numarFactura;
        this.sumaPlata = sumaPlata;
    }

    public abstract void emitereFactura();

    @Override
    public String toString() {
        return "Factura{" +
                " numarFactura='" + numarFactura + '\'' +
                ", sumaPlata=" + sumaPlata +
                '}';
    }
}
