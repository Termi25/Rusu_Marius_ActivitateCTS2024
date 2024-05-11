package C_Farmacie.exercitiu14.main;

import C_Farmacie.exercitiu14.implementare.Farmacie;
import C_Farmacie.exercitiu14.implementare.TemplateFarmacie;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> cerereMedicamente=new ArrayList<>();
        cerereMedicamente.add(3);
        cerereMedicamente.add(2);
        cerereMedicamente.add(5);

        TemplateFarmacie farmacie=new Farmacie();
        farmacie.cumparaReteta(cerereMedicamente);
    }
}
