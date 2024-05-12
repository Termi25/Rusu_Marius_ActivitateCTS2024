package D_Banca.exercitiu14.main;

import D_Banca.exercitiu14.implementare.Bancomat;
import D_Banca.exercitiu14.implementare.TemplateBancomat;

public class Main {
    public static void main(String[] args) {
        TemplateBancomat bancomat=new Bancomat(1,"BCR",20.0);
        bancomat.retrageBaniDinCard(15.0);
    }
}
