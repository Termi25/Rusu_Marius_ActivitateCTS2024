package B_Restaurant.exercitiu16.implementare.subiect;

import B_Restaurant.exercitiu16.implementare.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    List<Observer> listaClienti;

    public Subiect() {
        this.listaClienti=new ArrayList<>();
    }

    public void aboneazaClient(Observer client){
        this.listaClienti.add(client);
    }

    public void dezaboneazaClient(Observer client){
        this.listaClienti.remove(client);
    }

    public void notificaTotiClientii(String mesaj){
        for(Observer client: this.listaClienti){
            client.notificaClient(mesaj,null,null,null);
        }
    }
}
