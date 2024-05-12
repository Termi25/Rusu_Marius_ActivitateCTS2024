package D_Banca.exercitiu6.implementare.decorator;

import D_Banca.exercitiu6.implementare.clase.CardAbstract;

public abstract class DecoratorCard extends CardAbstract {
    private CardAbstract cardAbstract;

    public DecoratorCard(int codCard, String dataExpirare,
                         String numeCard) {
        super(codCard, dataExpirare, numeCard);
    }

    public DecoratorCard(CardAbstract cardAbstract) {
        super(cardAbstract.getCodCard(),
                cardAbstract.getDataExpirare(),
                cardAbstract.getNumeCard());
        this.cardAbstract = cardAbstract;
    }

    @Override
    public void platesteOnline() {
        this.cardAbstract.platesteOnline();
    }

    @Override
    public void platesteNormal() {
        this.cardAbstract.platesteNormal();
    }

    public abstract void platesteContactLess();
}
