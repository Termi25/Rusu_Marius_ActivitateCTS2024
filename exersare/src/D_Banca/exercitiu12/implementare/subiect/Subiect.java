package D_Banca.exercitiu12.implementare.subiect;

import D_Banca.exercitiu12.implementare.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    List<Observer> listaAbonati;
    String denumire;

    public Subiect(String denumire) {
        this.denumire=denumire;
        this.listaAbonati =new ArrayList<>();
    }

    public void abonare(Observer observer){
        this.listaAbonati.add(observer);
    }

    public void dezabonare(Observer observer){
        this.listaAbonati.remove(observer);
    }

    public void notificaTotiAbonatii(String mesaj){
        for(Observer abonat:this.listaAbonati){
            abonat.primesteNotificare(mesaj);
        }
    }
}
