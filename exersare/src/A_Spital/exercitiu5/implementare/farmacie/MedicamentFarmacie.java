package A_Spital.exercitiu5.implementare.farmacie;

public class MedicamentFarmacie extends AbstractMedicamentFarmacie{
    public MedicamentFarmacie(String denumire) {
        super(denumire);
    }

    public String getDenumire() {
        return denumire;
    }

    @Override
    public void cumparaMedicament(){

        System.out.println("S-a cumparat medicamentul "
                +this.denumire);
    }
}
