package C_Farmacie.exercitiu9.implementare;

public abstract class ClientAbstract {
    int codClient;
    String numeClient;
    boolean areReteta;

    public ClientAbstract(int codClient, String numeClient,boolean areReteta) {
        this.areReteta = areReteta;
        this.codClient = codClient;
        this.numeClient = numeClient;
    }

    public abstract void cumparaMedicamente();
}
