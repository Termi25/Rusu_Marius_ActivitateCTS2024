package D_Banca.exercitiu13.main;

import D_Banca.exercitiu13.implementare.Bancomat;

public class Main {
    public static void main(String[] args) {
        Bancomat bancomat=new Bancomat(1,"BRD",20.0);
        bancomat.introducereCard();
        bancomat.introducereCodPin();
        bancomat.retragereBani(21.0);

        System.out.println();
        bancomat.introducereCard();
    }
}
