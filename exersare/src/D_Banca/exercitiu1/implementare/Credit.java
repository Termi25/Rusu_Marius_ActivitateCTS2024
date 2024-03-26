package D_Banca.exercitiu1.implementare;

public abstract class Credit {
    private String numeClient;
    private int sumaCredit;
    private int luniiRambursare;

    protected Credit(String numeClient, int sumaCredit, int luniiRambursare) {
        this.numeClient = numeClient;
        this.sumaCredit = sumaCredit;
        this.luniiRambursare = luniiRambursare;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public int getSumaCredit() {
        return sumaCredit;
    }

    public void setSumaCredit(int sumaCredit) {
        this.sumaCredit = sumaCredit;
    }

    public int getLuniiRambursare() {
        return luniiRambursare;
    }

    public void setLuniiRambursare(int luniiRambursare) {
        this.luniiRambursare = luniiRambursare;
    }
}
