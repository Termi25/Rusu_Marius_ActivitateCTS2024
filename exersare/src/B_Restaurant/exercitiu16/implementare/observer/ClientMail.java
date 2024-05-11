package B_Restaurant.exercitiu16.implementare.observer;

public class ClientMail extends Observer{
    @Override
    public void notificaClient(String mesaj,String numeClient, String email, String numarTelefon) {
        if(email!=null){
            System.out.println("Clientul "+numeClient
                    +" a primit prin adresa "+email+" notificarea: "+mesaj);
        }else{
            this.tipNotificare.notificaClient(mesaj,
                    numeClient,email, numarTelefon);
        }
    }
}
