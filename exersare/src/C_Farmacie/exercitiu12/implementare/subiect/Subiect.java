package C_Farmacie.exercitiu12.implementare.subiect;

import C_Farmacie.exercitiu12.implementare.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    List<Observer> listaAbonati;

    public Subiect() {
        this.listaAbonati=new ArrayList<>();
    }

    public void abonare(Observer client){
        this.listaAbonati.add(client);
    }

    public void dezabonare(Observer client){
        this.listaAbonati.remove(client);
    }

    public void notificaTotiAbonatii(String mesaj){
        for(Observer abonat:this.listaAbonati){
            abonat.notificaClient(mesaj);
        }
    }

    public abstract void notificareOfertaMedicamente();
}
