package A_Spital.exercitiu6.main;

import A_Spital.exercitiu6.implementare.FacadeVerificariSpital;
import A_Spital.exercitiu6.implementare.Medic;
import A_Spital.exercitiu6.implementare.Pacient;
import A_Spital.exercitiu6.implementare.Salon;

public class Main {
    public static void main(String[] args) {
        Pacient pacient=new Pacient(2345,"Popescu","grav");
        Medic medic=new Medic(1234,"Manole");
        Salon salon=new Salon(1235);
        FacadeVerificariSpital facadeVerificariSpital=new FacadeVerificariSpital(pacient,medic,salon);
        facadeVerificariSpital.verificaInternarePacient();
        facadeVerificariSpital.verificaInternarePacient();
        facadeVerificariSpital.verificaInternarePacient();
        facadeVerificariSpital.verificaInternarePacient();
    }
}
