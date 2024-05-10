package A_Spital.exercitiu6.implementare;

public class Medic {
    int numarMedic;
    String numeMedic;

    public Medic(int numarMedic, String numeMedic) {
        this.numarMedic = numarMedic;
        this.numeMedic = numeMedic;
    }

    public String getNumeMedic() {
        return numeMedic;
    }

    public boolean confirmaInternarePacient(Pacient pacient){
        if(pacient.verificaStarePacient()){
            return true;
        }
        return false;
    }
}
