package C_Farmacie.exercitiu9.implementare;

public class ClientProxy implements ClientAbstract{
    private ClientAbstract client;

    public ClientProxy(ClientAbstract client) {
        this.client = client;
    }

    @Override
    public void cumparaMedicamente() {
        if(this.client.getAreReteta()){
            this.client.cumparaMedicamente();
        }else{
            System.out.println("Clientul nu poate cumpara medicamente fara reteta.");
        }
    }

    @Override
    public boolean getAreReteta() {
        return this.client.getAreReteta();
    }
}
