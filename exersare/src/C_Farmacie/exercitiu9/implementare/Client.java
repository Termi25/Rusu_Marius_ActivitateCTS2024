package C_Farmacie.exercitiu9.implementare;

public class Client implements ClientAbstract{

    int codClient;
    String numeClient;
    boolean areReteta;

    public Client(int codClient, String numeClient,boolean areReteta) {
        this.areReteta = areReteta;
        this.codClient = codClient;
        this.numeClient = numeClient;
    }

    @Override
    public void cumparaMedicamente() {
        System.out.println("Clientul "+numeClient+" a cumparat medicamente.");
    }

    @Override
    public boolean getAreReteta() {
        return areReteta;
    }
}
