package C_Farmacie.exercitiu5.main;

import C_Farmacie.exercitiu5.implementare.adapter.AdapterStocFarmacie;
import C_Farmacie.exercitiu5.implementare.depozit.StocDepozitAbstract;
import C_Farmacie.exercitiu5.implementare.farmacie.StocFarmacie;
import C_Farmacie.exercitiu5.implementare.farmacie.StocFarmacieAbstract;

public class Main {
    public static void main(String[] args) {
        StocFarmacieAbstract stocFarmacie=new StocFarmacie();

        StocDepozitAbstract stocFarmacieDepozit=new AdapterStocFarmacie(stocFarmacie);
        afisareDisponibilitate(stocFarmacieDepozit.verificaStocPentruMedicament(2,9));
    }

    public static void afisareDisponibilitate(boolean valoare){
        if(valoare){
            System.out.println("Medicamentul este disponibil.");
        }else{
            System.out.println("Medicamentul nu este disponibil.");
        }
    }
}
