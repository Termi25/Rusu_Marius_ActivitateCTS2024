package B_Restaurant.exercitiu5.implementare.bar;

public abstract class PrintareBarAbstracta {
    int numarFactura;
    int numarBarman;
    double sumaPlata;

    public PrintareBarAbstracta(int numarBarman, int numarFactura, double sumaPlata) {
        this.numarBarman = numarBarman;
        this.numarFactura = numarFactura;
        this.sumaPlata = sumaPlata;
    }

    public int getNumarBarman() {
        return numarBarman;
    }

    public int getNumarFactura() {
        return numarFactura;
    }

    public double getSumaPlata() {
        return sumaPlata;
    }

    public abstract void emitereFactura();

    @Override
    public String toString() {
        return "Factura{" +
                "numarBarman=" + numarBarman +
                ", numarFactura='" + numarFactura + '\'' +
                ", sumaPlata=" + sumaPlata +
                '}';
    }
}
