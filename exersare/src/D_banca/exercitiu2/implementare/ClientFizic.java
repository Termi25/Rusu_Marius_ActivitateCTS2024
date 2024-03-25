package D_banca.exercitiu2.implementare;

public class ClientFizic extends Client{
    public ClientFizic(String numeCreditor, int sumaCredit) {
        super(numeCreditor, sumaCredit);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClientFizic{");
        sb.append(this.getNumeClient());
        sb.append(", ");
        sb.append(this.getSumaCredit());
        sb.append('}');
        return sb.toString();
    }
}
