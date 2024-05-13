package E_Sportiv.exercitiu12.implementare.subiect;

import D_Banca.exercitiu12.implementare.observer.Observer;

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
            abonat.primesteNotificare(mesaj);
        }
    }

    public abstract void notificareMeciFotbal();
    public abstract void notificareMeciHandbal();
    public abstract void notificareMeciVolei();
}
