package D_Banca.exercitiu3.main;

import D_Banca.exercitiu3.implementare.Builder;
import D_Banca.exercitiu3.implementare.ContBancar;

public class Main {
    public static void main(String[] args) {
        Builder builderCont=new ContBancar.BuilderContBancar("George",123456789);
        ContBancar contClient=builderCont.setIsContSalariu().setIsHasCardAtasat().build();
        System.out.println(contClient);
    }
}
