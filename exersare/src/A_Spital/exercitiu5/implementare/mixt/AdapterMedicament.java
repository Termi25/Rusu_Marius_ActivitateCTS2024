package A_Spital.exercitiu5.implementare.mixt;

import A_Spital.exercitiu5.implementare.farmacie.AbstractMedicamentFarmacie;
import A_Spital.exercitiu5.implementare.spital.AbstractMedicamentSpital;

public class AdapterMedicament extends AbstractMedicamentSpital {
    private AbstractMedicamentFarmacie medicamentFarmacie;
    public AdapterMedicament(String denumire) {
        super(denumire);
    }

    public AdapterMedicament(AbstractMedicamentFarmacie medicamentFarmacie){
        super(medicamentFarmacie.getDenumire());
        this.medicamentFarmacie=medicamentFarmacie;
    }

    @Override
    public void achizitioneazaMedicament(String codReteta) {
        this.medicamentFarmacie.cumparaMedicament();
    }

    @Override
    public boolean prezintaReteta(String codReteta) {
        return codReteta.length()==12;
    }




}
