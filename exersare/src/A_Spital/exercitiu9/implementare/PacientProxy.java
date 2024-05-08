package A_Spital.exercitiu9.implementare;

public class PacientProxy implements PacientAbstract{
    private PacientAbstract pacient;

    public PacientProxy(PacientAbstract pacient) {
        this.pacient = pacient;
    }

    @Override
    public void internarePersoana(Persoana persoana) {
        if(persoana.areAsigurare()){
            pacient.internarePersoana(persoana);
        }else{
            System.out.println(persoana.getNume()+" nu are asigurare de sanatate.");
        }
    }
}
