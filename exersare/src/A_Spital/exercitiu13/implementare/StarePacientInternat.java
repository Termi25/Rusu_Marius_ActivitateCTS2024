package A_Spital.exercitiu13.implementare;

public class StarePacientInternat implements StarePacient{
    @Override
    public void schimbareStare(Pacient pacient) {
        pacient.setStare(this);
    }
}
