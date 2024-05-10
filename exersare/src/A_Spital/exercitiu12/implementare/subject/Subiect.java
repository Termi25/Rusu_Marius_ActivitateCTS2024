package A_Spital.exercitiu12.implementare.subject;

import A_Spital.exercitiu12.implementare.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    List<Observer> listaObserveri;

    public Subiect() {
        this.listaObserveri = new ArrayList<>();
    }

    public void abonarePacient(Observer pacient){
        this.listaObserveri.add(pacient);
    }

    public void dezabonarepacient(Observer pacient){
        this.listaObserveri.remove(pacient);
    }

    public void notificarePacientiAbonati(String mesaj){
        for(Observer pacient:listaObserveri){
            pacient.primesteNotificare(mesaj);
        }
    }

    public abstract void notificarePacientiVirus();

}
