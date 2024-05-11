package B_Restaurant.exercitiu16.implementare.observer;

public class Client extends Observer{
    private String nume;
    private String adresaMail;
    private String numarTelefon;

    public Client(String nume, String adresaMail, String numarTelefon) {
        this.nume = nume;
        this.adresaMail=adresaMail;
        this.numarTelefon=numarTelefon;
        this.tipNotificare=new ClientSMS();

        Observer tip2=new ClientMail();
        Observer tip3 =new ClientNoContact();

        tip2.setSuccessor(tip3);
        this.tipNotificare.setSuccessor(tip2);
    }

    public void setAdresaMail(String adresaMail) {
        this.adresaMail = adresaMail;
    }

    public void setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    public String getAdresaMail() {
        return adresaMail;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void notificaClient(String mesaj,String numeClient,
                               String email, String numarTelefon) {
        this.tipNotificare.notificaClient(mesaj,nume,
                adresaMail,this.numarTelefon);
    }
}
