package F_STB.exercitiu7.implementare.decorator;

import F_STB.exercitiu7.implementare.clase.BiletAbstract;

public abstract class DecoratorBilet extends BiletAbstract {
    private BiletAbstract bilet;

    public DecoratorBilet(BiletAbstract bilet) {
        super(bilet.getCodBilet());
        this.bilet = bilet;
    }

    public DecoratorBilet(int codBilet) {
        super(codBilet);
    }

    public abstract void cumparaBiletPersonalizat();
}
