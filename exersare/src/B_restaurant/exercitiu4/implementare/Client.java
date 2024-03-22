package B_restaurant.exercitiu4.implementare;

public class Client implements AbstractClient{
    private String numeClient;
    private String numarTelefonClient;

    public Client(String numeClient, String numarTelefonClient) {
        this.numeClient = numeClient;
        if(numarTelefonClient.length()<13){
            throw new RuntimeException("Numar de telefon client invalid");
        }else{
            this.numarTelefonClient = numarTelefonClient;
        }
    }

    private Client(){

    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", numarTelefonClient=").append(numarTelefonClient);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public AbstractClient cloneaza() {
        Client client=new Client();
        client.numeClient=this.numeClient;
        client.numarTelefonClient=this.numarTelefonClient;
        return client;
    }
}
