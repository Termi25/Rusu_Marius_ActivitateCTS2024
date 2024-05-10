package B_Restaurant.exercitiu5.main;

import B_Restaurant.exercitiu5.implementare.adapter.AdapterBarBucatarie;
import B_Restaurant.exercitiu5.implementare.bar.PrintareBar;
import B_Restaurant.exercitiu5.implementare.bar.PrintareBarAbstracta;
import B_Restaurant.exercitiu5.implementare.bucatarie.PrintareBucatarie;
import B_Restaurant.exercitiu5.implementare.bucatarie.PrintareBucatarieAbstracta;

public class Main {
    public static void main(String[] args) {
        PrintareBucatarieAbstracta facturaBuc=new PrintareBucatarie(1,20.0);
        PrintareBarAbstracta facturaBar=new PrintareBar(123,200,30.0);

        PrintareBucatarieAbstracta adapter=new AdapterBarBucatarie(facturaBar);
        facturaBuc.emitereFactura();
        adapter.emitereFactura();
    }
}
