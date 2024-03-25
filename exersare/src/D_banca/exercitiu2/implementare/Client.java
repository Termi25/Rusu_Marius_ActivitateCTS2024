package D_banca.exercitiu2.implementare;

public abstract class Client {
    private String numeClient;
    private int sumaCredit;

    public Client(String numeCreditor, int sumaCredit) {
        this.numeClient = numeCreditor;
        this.sumaCredit = sumaCredit;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeCreditor) {
        this.numeClient = numeCreditor;
    }

    public int getSumaCredit() {
        return sumaCredit;
    }

    public void setSumaCredit(int sumaCredit) {
        this.sumaCredit = sumaCredit;
    }
}
