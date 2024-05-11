package C_Farmacie.exercitiu9.implementare;

public class Client extends ClientAbstract{
    public Client(int codClient, String numeClient, boolean areReteta) {
        super(codClient, numeClient, areReteta);
    }

    @Override
    public void cumparaMedicamente() {
        System.out.println("Clientul "+numeClient+" a cumparat medicamente.");
    }
}
