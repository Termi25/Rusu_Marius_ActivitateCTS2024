package A_Spital.exercitiu9.implementare;

public class Pacient implements PacientAbstract{
    private String numePacient;

    public Pacient( String numePacient) {
        this.numePacient = numePacient;
    }

    @Override
    public void internarePersoana(Persoana Persoana) {
        System.out.println(numePacient+" va fi internat.");
    }
}
