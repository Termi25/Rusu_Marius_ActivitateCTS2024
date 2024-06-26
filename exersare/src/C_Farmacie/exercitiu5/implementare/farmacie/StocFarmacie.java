package C_Farmacie.exercitiu5.implementare.farmacie;

public class StocFarmacie extends StocFarmacieAbstract{
    @Override
    public void setareMedicament(int index) {
        this.medicamentSetat=index;
    }

    @Override
    public boolean verificareDisponibilitate(int numarBucati) {
        return this.listaStocMedicamente
                .get(this.medicamentSetat)>=numarBucati;
    }
}
