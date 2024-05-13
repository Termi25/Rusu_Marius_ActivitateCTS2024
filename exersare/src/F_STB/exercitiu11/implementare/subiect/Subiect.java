package F_STB.exercitiu11.implementare.subiect;

import F_STB.exercitiu11.implementare.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    List<Observer> listaAbonati;

    public Subiect(){
        this.listaAbonati=new ArrayList<>();
    }

    public void aboneaza(Observer observer){
        this.listaAbonati.add(observer);
    }

    public void dezaboneaza(Observer observer){
        this.listaAbonati.remove(observer);
    }

    public void notificaAbonati(String mesaj){
        for(Observer abonat:this.listaAbonati){
            abonat.notificaUtilizator(mesaj);
        }
    }

    public abstract void notificaPlecareCapatLinie();
}
