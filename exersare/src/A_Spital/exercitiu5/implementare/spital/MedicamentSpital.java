package A_Spital.exercitiu5.implementare.spital;

public class MedicamentSpital extends AbstractMedicamentSpital {
    public MedicamentSpital(String denumire) {
        super(denumire);
    }

    @Override
    public void achizitioneazaMedicament(String codReteta){
        if(prezintaReteta(codReteta)){
            System.out.println("S-a achizitionat medicamentul "
                    +this.denumire);
        }else{
            System.out.println("Nu s-a cumparat medicamentul "
                    +this.denumire+". Reteta este invalida.");
        }
    }

    @Override
    public boolean prezintaReteta(String codReteta){
        return codReteta.length() == 12;
    }
}
