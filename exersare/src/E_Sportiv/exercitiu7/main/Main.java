package E_Sportiv.exercitiu7.main;

import E_Sportiv.exercitiu7.implementare.clase.BiletAbstract;
import E_Sportiv.exercitiu7.implementare.decorator.BiletEchipaLocala;

public class Main {
    public static void main(String[] args) {
        BiletAbstract bilet=new BiletEchipaLocala(
                "Manole",
                3,
                7,
                "20:30",
                true);
        bilet.vindeBilet();
    }
}
