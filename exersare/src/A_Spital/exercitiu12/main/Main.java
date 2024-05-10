package A_Spital.exercitiu12.main;

import A_Spital.exercitiu12.implementare.observer.Observer;
import A_Spital.exercitiu12.implementare.observer.Pacient;
import A_Spital.exercitiu12.implementare.subject.Spital;
import A_Spital.exercitiu12.implementare.subject.Subiect;

public class Main {
    public static void main(String[] args) {
        Observer pacient1=new Pacient(1,"Manole");
        Observer pacient2 =new Pacient(2,"Popescu");
        Subiect spital=new Spital("Calea Victoriei 25");
        spital.abonarePacient(pacient1);
        spital.abonarePacient(pacient2);
        spital.notificarePacientiVirus();

        System.out.println();
        spital.dezabonarepacient(pacient1);
        spital.notificarePacientiAbonati("salut");
    }
}
