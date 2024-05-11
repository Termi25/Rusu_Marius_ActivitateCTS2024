package B_Restaurant.exercitiu16.implementare.observer;

public class ClientSMS extends Observer{
    @Override
    public void notificaClient(String mesaj, String numeClient,
                               String email, String numarTelefon) {
        if(numarTelefon!=null){
            System.out.println("Clientul "+numeClient
                    +" a primit prin numarul de telefon "
                    +numarTelefon+" notificarea: "+mesaj);
        }else{
            this.tipNotificare.notificaClient(mesaj,
                    numeClient,email,numarTelefon);
        }
    }
}
