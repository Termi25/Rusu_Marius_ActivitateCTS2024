package F_STB.exercitiu14.main;

import F_STB.exercitiu14.implementare.TemplateTramvai;
import F_STB.exercitiu14.implementare.Tramvai;

public class Main {
    public static void main(String[] args) {
        TemplateTramvai tramvai=new Tramvai(19);
        tramvai.parcurgereTraseuDus();
        tramvai.parcurgereTraseuIntors();
    }
}
