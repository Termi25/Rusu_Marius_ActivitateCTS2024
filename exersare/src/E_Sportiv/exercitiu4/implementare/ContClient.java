package E_Sportiv.exercitiu4.implementare;

public class ContClient implements PrototypeContClient{
    private String numeClient;
    private int varstaClient;

    public ContClient(String numeClient, int varstaClient) {
        this.numeClient = numeClient;
        if(varstaClient<18){
            throw new RuntimeException("Clientul este minor");
        }
        this.varstaClient = varstaClient;
    }

    private ContClient(){}
    @Override
    public PrototypeContClient cloneaza() {
        ContClient nou=new ContClient();
        nou.numeClient=this.numeClient;
        nou.varstaClient=this.varstaClient;
        return nou;
    }

    @Override
    public void setNume(String nume) {
        this.numeClient=nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContClient{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", varstaClient=").append(varstaClient);
        sb.append('}');
        return sb.toString();
    }
}
