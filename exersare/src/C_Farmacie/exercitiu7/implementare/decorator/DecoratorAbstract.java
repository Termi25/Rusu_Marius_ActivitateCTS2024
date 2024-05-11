package C_Farmacie.exercitiu7.implementare.decorator;

import C_Farmacie.exercitiu7.implementare.clase.BonDeCasaAbstract;

public abstract class DecoratorAbstract extends BonDeCasaAbstract {
    private BonDeCasaAbstract bonDeCasa;

    public DecoratorAbstract(int codBon, double sumaDePlata) {
        super(codBon, sumaDePlata);
    }

    public DecoratorAbstract(BonDeCasaAbstract bonDeCasa) {
        super(bonDeCasa.getCodBon(), bonDeCasa.getSumaDePlata());
        this.bonDeCasa = bonDeCasa;
    }

    public BonDeCasaAbstract getBonDeCasa() {
        return bonDeCasa;
    }

    public abstract void afiseazaMesajExtra();
}
