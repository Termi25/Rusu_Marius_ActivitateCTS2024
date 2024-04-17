package F_STB.exercitiu4.metrou;

public abstract class Calatorie {
    private String numeClient;

    public Calatorie(String numeClient) {
        this.numeClient = numeClient;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public abstract boolean estePermisAccesul();
}
