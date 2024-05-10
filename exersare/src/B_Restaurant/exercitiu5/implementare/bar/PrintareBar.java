package B_Restaurant.exercitiu5.implementare.bar;

public class PrintareBar extends PrintareBarAbstracta{
    public PrintareBar(int numarBarman, int numarFactura, double sumaPlata) {
        super(numarBarman, numarFactura, sumaPlata);
    }

    @Override
    public void emitereFactura() {
        System.out.println("Factura "+numarFactura+" cu barman "+numarBarman+" si suma de "+sumaPlata);
    }
}
