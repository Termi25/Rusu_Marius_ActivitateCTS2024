package F_STB.exercitiu11.main;

import F_STB.exercitiu11.implementare.observer.Observer;
import F_STB.exercitiu11.implementare.observer.Utilizator;
import F_STB.exercitiu11.implementare.subiect.Autobuz;
import F_STB.exercitiu11.implementare.subiect.Subiect;

public class Main {
    public static void main(String[] args) {
        Subiect autobuz=new Autobuz(123);
        Observer utilizator1=new Utilizator("Manole");
        Observer utilizator2=new Utilizator("Popescu");

        autobuz.aboneaza(utilizator1);
        autobuz.aboneaza(utilizator2);

        autobuz.notificaPlecareCapatLinie();
    }
}
