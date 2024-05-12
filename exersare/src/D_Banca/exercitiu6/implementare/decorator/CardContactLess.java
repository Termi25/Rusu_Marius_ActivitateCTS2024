package D_Banca.exercitiu6.implementare.decorator;

import D_Banca.exercitiu6.implementare.clase.CardAbstract;

public class CardContactLess extends DecoratorCard{
    public CardContactLess(CardAbstract cardAbstract) {
        super(cardAbstract);
    }

    public CardContactLess(int codCard, String dataExpirare, String numeCard) {
        super(codCard, dataExpirare, numeCard);
    }

    @Override
    public void platesteContactLess() {
        System.out.println("S-a utilizat la plata contactless cardul cu numarul "
                +codCard+" detinut de "
                +numeCard+" care expira la data de "
                +dataExpirare);
    }
}
