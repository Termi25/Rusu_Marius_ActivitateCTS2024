package C_Farmacie.exercitiu12.implementare.observer;

public class Client implements Observer{
    String nume;
    int codClient;

    public Client(int codClient, String nume) {
        this.codClient = codClient;
        this.nume = nume;
    }

    @Override
    public void notificaClient(String mesaj) {
        System.out.println("Clientul "+nume
                +" a primit notificarea: "+mesaj);
    }
}
