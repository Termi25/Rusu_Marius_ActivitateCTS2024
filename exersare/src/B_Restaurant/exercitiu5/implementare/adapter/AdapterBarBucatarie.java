package B_Restaurant.exercitiu5.implementare.adapter;

import B_Restaurant.exercitiu5.implementare.bar.PrintareBarAbstracta;
import B_Restaurant.exercitiu5.implementare.bucatarie.PrintareBucatarieAbstracta;

public class AdapterBarBucatarie extends PrintareBucatarieAbstracta {
    PrintareBarAbstracta facturaBar;
    public AdapterBarBucatarie(int numarFactura, double sumaPlata) {
        super(numarFactura, sumaPlata);
    }

    @Override
    public void emitereFactura() {
        this.facturaBar.emitereFactura();
    }

    public AdapterBarBucatarie(PrintareBarAbstracta facturaBar) {
        super(facturaBar.getNumarFactura(), facturaBar.getSumaPlata());
        this.facturaBar = facturaBar;
    }
}
