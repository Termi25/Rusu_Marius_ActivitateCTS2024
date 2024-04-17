package F_STB.exercitiu4.main;

import F_STB.exercitiu4.metrou.BiletMetrou;
import F_STB.exercitiu4.metrou.Calatorie;
import F_STB.exercitiu4.suprateran.AdapterCalatorie;
import F_STB.exercitiu4.suprateran.CardSTB;

public class Main {
    public static void validareIntrareMetrou(Calatorie calatorie){
        if(calatorie.estePermisAccesul()){
            System.out.println("Calatorie placuta!");
        }else{
            System.out.println("Sold calatorii insuficient.");
        }
    }
    public static void validareUrcareSTB(CardSTB card){
        card.validareCalatorie();
    }
    public static void main(String[] args) {
        Calatorie biletMetrou=new BiletMetrou("Manole",2);
        validareIntrareMetrou(biletMetrou);

        CardSTB biletMixt=new AdapterCalatorie(biletMetrou);
        validareUrcareSTB(biletMixt);
        validareIntrareMetrou(biletMetrou);
    }
}
