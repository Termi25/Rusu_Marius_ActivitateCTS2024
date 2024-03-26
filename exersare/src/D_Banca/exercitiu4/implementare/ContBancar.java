package D_Banca.exercitiu4.implementare;

public class ContBancar implements PrototypeContBancar{

    private String numeClient;
    private String cnpClient;
    private String cardCreditPlata;

    public ContBancar(String numeClient, String cnpClient,
                      String cardCreditPlata) {
        this.numeClient = numeClient;
        if(cnpClient.length()!=13){
            throw new RuntimeException("CNP incorect");
        }
        this.cnpClient = cnpClient;
        if(cardCreditPlata.length()!=16){
            throw new RuntimeException(
                    "Card de credit pentru plata incorect");
        }
        this.cardCreditPlata = cardCreditPlata;
    }

    private ContBancar(){}

    @Override
    public PrototypeContBancar cloneaza() {
        ContBancar nou=new ContBancar();
        nou.numeClient=this.numeClient;
        nou.cnpClient=this.cnpClient;
        nou.cardCreditPlata=this.cardCreditPlata;
        return nou;
    }

    @Override
    public void setNume(String nume) {
        this.numeClient=nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContBancar{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", cnpClient='").append(cnpClient).append('\'');
        sb.append(", cardCreditPlata='").append(cardCreditPlata).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
