package C_Farmacie.exercitiu7.main;

import C_Farmacie.exercitiu7.implementare.clase.BonDeCasa;
import C_Farmacie.exercitiu7.implementare.clase.BonDeCasaAbstract;
import C_Farmacie.exercitiu7.implementare.decorator.BonDeCasaSarbatori;
import C_Farmacie.exercitiu7.implementare.decorator.DecoratorAbstract;

public class Main {
    public static void main(String[] args) {
        BonDeCasaAbstract bon=new BonDeCasa(1,12.0);
        DecoratorAbstract bonSarbatori=new BonDeCasaSarbatori(bon);
        bonSarbatori.printeazaBon();
    }
}
