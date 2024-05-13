package F_STB.exercitiu7.main;

import F_STB.exercitiu7.implementare.clase.Bilet;
import F_STB.exercitiu7.implementare.clase.BiletAbstract;
import F_STB.exercitiu7.implementare.decorator.BiletPersonalizat;

public class Main {
    public static void main(String[] args) {
        BiletAbstract bilet=new Bilet(1);
        BiletAbstract biletPersonalizat=
                new BiletPersonalizat(bilet);
        biletPersonalizat.cumparaBilet();
    }
}
