package D_Banca.exercitiu7.main;

import D_Banca.exercitiu7.implementare.ContBancar;
import D_Banca.exercitiu7.implementare.FacadeContBancar;

public class Main {
    public static void main(String[] args) {
        ContBancar cont=new ContBancar(false,false,"Manole",30);
        FacadeContBancar facadeCont=new FacadeContBancar(cont);
        facadeCont.verificareContCompleta();
    }
}
