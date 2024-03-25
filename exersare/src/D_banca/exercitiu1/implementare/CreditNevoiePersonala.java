package D_banca.exercitiu1.implementare;

public class CreditNevoiePersonala extends Credit{
    public CreditNevoiePersonala(String numeClient, int sumaCredit, int luniiRambursare) {
        super(numeClient, sumaCredit, luniiRambursare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CreditNevoiePersonala{");
        sb.append(this.getNumeClient());
        sb.append(", ");
        sb.append(this.getSumaCredit());
        sb.append('}');
        return sb.toString();
    }
}
