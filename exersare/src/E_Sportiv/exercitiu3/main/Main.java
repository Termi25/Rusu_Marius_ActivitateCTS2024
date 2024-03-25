package E_Sportiv.exercitiu3.main;

import E_Sportiv.exercitiu3.implementare.InterfaceBuilder;
import E_Sportiv.exercitiu3.implementare.Rezervare;

public class Main {
    public static void main(String[] args) {
        InterfaceBuilder builderRezervare=new Rezervare.RezervareBuilder("Andrei");
        Rezervare rezervare1=builderRezervare.setHasBeverage().setHasErgonomicChair().build();
        System.out.println(rezervare1);
    }
}
