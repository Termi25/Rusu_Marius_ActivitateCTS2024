package E_Sportiv.exercitiu13.main;

import E_Sportiv.exercitiu13.implementare.LocStadion;

public class Main {
    public static void main(String[] args) {
        LocStadion loc=new LocStadion(1,2);
        loc.rezervareLoc();
        loc.ocupaLoc();
        loc.elibereazaLoc();

        loc.elibereazaLoc();
    }
}
