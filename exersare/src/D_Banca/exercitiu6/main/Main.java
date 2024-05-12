package D_Banca.exercitiu6.main;

import D_Banca.exercitiu6.implementare.clase.CardAbstract;
import D_Banca.exercitiu6.implementare.clase.CardBancar;
import D_Banca.exercitiu6.implementare.decorator.CardContactLess;
import D_Banca.exercitiu6.implementare.decorator.DecoratorCard;

public class Main {
    public static void main(String[] args) {
        CardAbstract card=new CardBancar(12345,
                "03/27","Manole");
        DecoratorCard cardContactLess=new CardContactLess(card);
        cardContactLess.platesteContactLess();
    }
}
