package E_Sportiv.exercitiu5.main;

import E_Sportiv.exercitiu5.implementare.adapter.AdapterBilet;
import E_Sportiv.exercitiu5.implementare.aplicatie_externa.BiletWebsiteAbstract;
import E_Sportiv.exercitiu5.implementare.aplicatie_proprie.BiletAbstract;
import E_Sportiv.exercitiu5.implementare.aplicatie_proprie.BiletPropriu;

public class Main {
    public static void main(String[] args) {
        BiletAbstract biletAplicatie=new BiletPropriu(
                "Manole",7,1,"20:00");
        BiletWebsiteAbstract biletWebsite=new AdapterBilet(
                biletAplicatie);
        biletWebsite.vanzareBilet();
    }
}
