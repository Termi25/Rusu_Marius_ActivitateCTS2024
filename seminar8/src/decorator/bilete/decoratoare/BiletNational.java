package decorator.bilete.decoratoare;

import decorator.bilete.clase.BiletAbstract;

public class BiletNational extends DecoratorBilet{
    private static double valoareDiscount=0.85;
    public BiletNational(String echipaGazda, String echipaOaspeti, double pretBilet) {
        super(echipaGazda, echipaOaspeti, pretBilet);
    }

    public BiletNational(BiletAbstract biletDecorat) {
        super(biletDecorat);
    }

    @Override
    public void printareBilet() {
        this.getBiletAbstract().printareBilet();
        System.out.println(this.getEchipaGazda()+" mult succes!");
    }

    @Override
    public void aplicaDiscountBilet() {

        this.getBiletAbstract().setPretBilet(this.getBiletAbstract().getPretBilet()*valoareDiscount);
    }
}
