package A_Spital.exercitiu13.main;

import A_Spital.exercitiu13.implementare.Pacient;

public class Main {
    public static void main(String[] args) {
        Pacient pacient=new Pacient(1,"Manole");
        System.out.println(pacient);

        pacient.vindecarePacient();
        System.out.println(pacient);

        System.out.println();
        pacient.verificareStarePacient("grav");
        System.out.println(pacient);

        System.out.println();
        pacient.vindecarePacient();
    }
}
