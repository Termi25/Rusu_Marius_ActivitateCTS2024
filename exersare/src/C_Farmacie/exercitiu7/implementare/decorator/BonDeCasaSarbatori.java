package C_Farmacie.exercitiu7.implementare.decorator;

import C_Farmacie.exercitiu7.implementare.clase.BonDeCasaAbstract;

public class BonDeCasaSarbatori extends DecoratorAbstract{
    public BonDeCasaSarbatori(BonDeCasaAbstract bonDeCasa) {
        super(bonDeCasa);
    }

    public BonDeCasaSarbatori(int codBon, double sumaDePlata) {
        super(codBon, sumaDePlata);
    }

    @Override
    public void printeazaBon() {
        afiseazaMesajExtra();
    }

    @Override
    public void afiseazaMesajExtra() {
        this.getBonDeCasa().printeazaBon();
        System.out.println("~~ La Multi Ani!! ~~");
    }
}
