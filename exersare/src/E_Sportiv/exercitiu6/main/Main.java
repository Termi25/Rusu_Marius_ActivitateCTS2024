package E_Sportiv.exercitiu6.main;

import E_Sportiv.exercitiu6.implementare.FacadeOperator;
import E_Sportiv.exercitiu6.implementare.Operator;
import E_Sportiv.exercitiu6.implementare.Persoana;

public class Main {
    public static void main(String[] args) {
        Operator operator=new Operator("Popescu");
        Persoana persoana=new Persoana("Manole",
                false,false);

        FacadeOperator facadeOperator=
                new FacadeOperator(operator);
        facadeOperator.verificaTotalPersoana(persoana);
    }
}
