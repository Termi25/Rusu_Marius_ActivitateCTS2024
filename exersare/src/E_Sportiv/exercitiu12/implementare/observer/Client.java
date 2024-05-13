package E_Sportiv.exercitiu12.implementare.observer;

import D_Banca.exercitiu12.implementare.observer.Observer;

public class Client implements Observer {
    String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Clientul "+this.nume+
                " a primit notificarea: "+mesaj);
    }
}
