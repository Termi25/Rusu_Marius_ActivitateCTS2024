package B_Restaurant.exercitiu12.implementare.subject;

import B_Restaurant.exercitiu12.implementare.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    List<Observer> listaObserveri;

    public Subiect() {
        this.listaObserveri=new ArrayList<>();
    }

    public void abonareClient(Observer client){
        this.listaObserveri.add(client);
    }

    public void dezabonareClient(Observer client){
        this.listaObserveri.remove(client);
    }

    public void notificaTotiClientii(String mesaj){
        for(Observer client:this.listaObserveri){
            client.primesteNotificare(mesaj);
        }
    }

    public abstract void notificaModificarePret();
    public abstract void notificareMeniuNou();
}
