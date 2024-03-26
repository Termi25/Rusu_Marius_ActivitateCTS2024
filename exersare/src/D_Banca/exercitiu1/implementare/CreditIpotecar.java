package D_Banca.exercitiu1.implementare;

public class CreditIpotecar extends Credit{
    public CreditIpotecar(String numeClient, int sumaCredit, int luniiRambursare) {
        super(numeClient, sumaCredit, luniiRambursare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CreditIpotecar{");
        sb.append(this.getNumeClient());
        sb.append(", ");
        sb.append(this.getSumaCredit());
        sb.append('}');
        return sb.toString();
    }
}
