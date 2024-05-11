package C_Farmacie.exercitiu5.implementare.adapter;

import C_Farmacie.exercitiu5.implementare.depozit.StocDepozitAbstract;
import C_Farmacie.exercitiu5.implementare.farmacie.StocFarmacieAbstract;

public class AdapterStocFarmacie extends StocDepozitAbstract {
    private StocFarmacieAbstract stocFarmacie;
    public AdapterStocFarmacie(StocFarmacieAbstract stocFarmacie) {
        this.stocFarmacie=stocFarmacie;
    }

    @Override
    public boolean verificaStocPentruMedicament(int index,int numarBucati) {
        this.stocFarmacie.setareMedicament(index);
        return this.stocFarmacie.verificareDisponibilitate(numarBucati);
    }
}
