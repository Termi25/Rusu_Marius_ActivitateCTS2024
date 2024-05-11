package C_Farmacie.exercitiu6.main;

import C_Farmacie.exercitiu6.implementare.FacadeFarmacist;
import C_Farmacie.exercitiu6.implementare.Farmacist;

public class Main {
    public static void main(String[] args) {
        Farmacist farmacist=new Farmacist("Bob");
        FacadeFarmacist facadeFarmacist=new FacadeFarmacist(farmacist);
        facadeFarmacist.verificareTotala();
    }
}
