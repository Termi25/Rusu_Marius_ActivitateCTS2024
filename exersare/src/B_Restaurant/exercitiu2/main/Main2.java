package B_Restaurant.exercitiu2.main;

import B_Restaurant.exercitiu2.implementare.Rezervare;

public class Main2 {
    public static void main(String[] args) {
        Rezervare rezervare=new Rezervare.BuilderRezervare("Gary","0786557902").creareRezervare();
        System.out.println(rezervare);
        Rezervare rezervare1=new Rezervare.BuilderRezervare("Henry","0796557103").setHasCustomMusic().setHasErgonomicChairs().creareRezervare();
        System.out.println(rezervare1);
    }
}
