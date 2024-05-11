package C_Farmacie.exercitiu9.implementare;

public class ClientProxy extends ClientAbstract{
    public ClientProxy(int codClient, String numeClient, boolean areReteta) {
        super(codClient, numeClient, areReteta);
    }

    @Override
    public void cumparaMedicamente() {
        if(areReteta){
            System.out.println("Clientul "+numeClient+" a cumparat medicamente.");
        }else{
            System.out.println("Clientul "+numeClient+" nu poate cumpara medicamente fara reteta.");
        }
    }
}
