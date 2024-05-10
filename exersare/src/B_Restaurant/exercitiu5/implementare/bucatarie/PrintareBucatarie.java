package B_Restaurant.exercitiu5.implementare.bucatarie;

public class PrintareBucatarie extends PrintareBucatarieAbstracta{

    public PrintareBucatarie(int numarFactura, double sumaPlata) {
        super(numarFactura, sumaPlata);
    }

    @Override
    public void emitereFactura() {
        System.out.println("Factura "+numarFactura+" cu suma de plata "+sumaPlata);
    }
}
