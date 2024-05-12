package E_Sportiv.exercitiu8.main;

import E_Sportiv.exercitiu8.implementare.VanzareBiletAbstract;
import E_Sportiv.exercitiu8.implementare.VanzareBiletProxy;

public class Main {
    public static void main(String[] args) {
        VanzareBiletAbstract bilet=new VanzareBiletProxy(
                "Manole",3,7,"20:30",
                23);
        bilet.cumparareBilet();
    }
}
