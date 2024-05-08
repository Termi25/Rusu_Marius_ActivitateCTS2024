package C_Farmacie.exercitiu14.main;

import C_Farmacie.exercitiu14.implementare.AchizitieMedicamente;
import C_Farmacie.exercitiu14.implementare.AchizitiePeBazaDeReteta;
import C_Farmacie.exercitiu14.implementare.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta1=new Reteta(1234);
        reteta1.adaugareMedicamente("Paracetamol");
        reteta1.adaugareMedicamente("Mig400");

        AchizitieMedicamente achizitie1=new AchizitiePeBazaDeReteta(reteta1);
        achizitie1.achitioneazaMedicamente();

        System.out.println();
        Reteta reteta2=new Reteta(1235);
        reteta2.adaugareMedicamente("Paracetamol");
        reteta2.adaugareMedicamente("Ceva");

        AchizitieMedicamente achizitie2=new AchizitiePeBazaDeReteta(reteta1);
        achizitie2.achitioneazaMedicamente();
    }
}
