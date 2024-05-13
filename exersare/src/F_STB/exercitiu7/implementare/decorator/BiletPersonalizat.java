package F_STB.exercitiu7.implementare.decorator;

import F_STB.exercitiu7.implementare.clase.BiletAbstract;

public class BiletPersonalizat extends DecoratorBilet{
    public BiletPersonalizat(BiletAbstract bilet) {
        super(bilet);
    }

    public BiletPersonalizat(int codBilet) {
        super(codBilet);
    }

    @Override
    public void cumparaBiletPersonalizat() {
        System.out.println("S-a cumparat biletul cu codul "
                +codBilet);
        System.out.println("La multi ani!");
    }

    @Override
    public void cumparaBilet() {
        cumparaBiletPersonalizat();
    }
}
