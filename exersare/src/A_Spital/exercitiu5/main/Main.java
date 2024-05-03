package A_Spital.exercitiu5.main;

import A_Spital.exercitiu5.implementare.farmacie.AbstractMedicamentFarmacie;
import A_Spital.exercitiu5.implementare.farmacie.MedicamentFarmacie;
import A_Spital.exercitiu5.implementare.mixt.AdapterMedicament;
import A_Spital.exercitiu5.implementare.spital.AbstractMedicamentSpital;
import A_Spital.exercitiu5.implementare.spital.MedicamentSpital;

public class Main {
    public static void main(String[] args) {
        AbstractMedicamentFarmacie medicamentFarmacie=new MedicamentFarmacie("MIG400");
        AbstractMedicamentSpital medicamentSpital=new MedicamentSpital("Algocalmin");
        medicamentSpital.achizitioneazaMedicament("012345678912");

        AbstractMedicamentSpital medicamentSpitalConvertit=new AdapterMedicament(medicamentFarmacie);
        medicamentSpitalConvertit.achizitioneazaMedicament(null);
    }
}
