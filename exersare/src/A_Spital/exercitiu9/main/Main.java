package A_Spital.exercitiu9.main;

import A_Spital.exercitiu9.implementare.Pacient;
import A_Spital.exercitiu9.implementare.PacientAbstract;
import A_Spital.exercitiu9.implementare.PacientProxy;
import A_Spital.exercitiu9.implementare.Persoana;

public class Main {
    public static void main(String[] args) {
        Persoana persoana=new Persoana(true,"Manole");
        PacientAbstract pacient=new Pacient(persoana.getNume());
        PacientAbstract pacientProxy=new PacientProxy(pacient);
        pacientProxy.internarePersoana(persoana);
    }
}
