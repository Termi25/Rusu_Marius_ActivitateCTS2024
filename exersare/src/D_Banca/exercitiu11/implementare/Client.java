package D_Banca.exercitiu11.implementare;

public class Client {
    String nume;
    TipClient tipClient;

    public Client(String nume) {
        this.nume = nume;
        this.tipClient=new ClientFizic();
    }

    public void setTipClient(TipClient tipClient) {
        this.tipClient = tipClient;
    }

    public void inregistrareLaBanca(){
        this.tipClient.solicataDocumente(this.nume);
    }
}
