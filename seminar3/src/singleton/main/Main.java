package singleton.main;

import singleton.model.Guvern;

public class Main {
    public static void main(String[] args) {

        Guvern guv=Guvern.getInstance(2,"Manole",12);
        Guvern guv2=Guvern.getInstance(3,"Vaile",24);
        System.out.println(guv.toString()+'\n'+guv2.toString());
    }
}
