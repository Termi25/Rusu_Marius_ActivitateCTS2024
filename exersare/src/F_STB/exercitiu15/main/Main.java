package F_STB.exercitiu15.main;

import F_STB.exercitiu15.implementare.Autobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz(123);
        autobuz.pleacaInCursa();
        autobuz.ajungeCapatLinie();

        autobuz.reparaAutobuz();
        autobuz.finalizeazaReparatieAutobuz();
    }
}
