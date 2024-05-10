package A_Spital.exercitiu13.implementare;

public class StarePacientSubObservatie implements StarePacient{
    @Override
    public void schimbareStare(Pacient pacient) {
        pacient.setStare(this);
    }
}
