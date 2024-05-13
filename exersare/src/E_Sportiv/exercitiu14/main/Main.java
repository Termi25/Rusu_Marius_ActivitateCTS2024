package E_Sportiv.exercitiu14.main;

import E_Sportiv.exercitiu14.implementare.LocStadion;
import E_Sportiv.exercitiu14.implementare.TemplateOcupareLoc;

public class Main {
    public static void main(String[] args) {
        TemplateOcupareLoc loc=new LocStadion();
        loc.ocupareLoc();
    }
}
