package A_Spital.exercitiu14.main;

import A_Spital.exercitiu14.implementare.InternareAbstracta;
import A_Spital.exercitiu14.implementare.InternarePacientSpital;

public class Main {
    public static void main(String[] args) {
        InternareAbstracta internarePacient=new InternarePacientSpital();
        internarePacient.interneazaPacient("Manole","grav");
        internarePacient.interneazaPacient("Popescu","usor");
    }
}
