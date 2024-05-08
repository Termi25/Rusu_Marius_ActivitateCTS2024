package A_Spital.exercitiu6.implementare;

public class Pacient {
    int numarPacient;
    String numePacient;
    String starePacient;

    public Pacient(int numarPacient, String numePacient, String starePacient) {
        this.numarPacient = numarPacient;
        this.numePacient = numePacient;
        this.starePacient = starePacient;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public boolean verificaStarePacient() {
        if(this.starePacient.equals("grav")){
            return true;
        }
        return false;
    }
}
