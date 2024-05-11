package B_Restaurant.exercitiu16.implementare.observer;

public class ClientNoContact extends Observer{
    @Override
    public void notificaClient(String mesaj, String numeClient, String email, String numarTelefon) {
        System.out.println("Clientul "+numeClient
                +" nu are detalii de contact.");
    }
}
