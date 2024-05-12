package D_Banca.exercitiu12.implementare.observer;

public class Client implements Observer{
    String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Clientul "+nume
                +" a primit notificarea de la banca: "
                +mesaj);
    }
}
