package singleton.main;

import singleton.model.Guvern;

public class Main {
    public static void main(String[] args) {

        Guvern guv=Guvern.getInstance();
        Guvern guv2=Guvern.getInstance();
        System.out.println(guv.toString()+'\n'+guv2.toString());
    }
}
