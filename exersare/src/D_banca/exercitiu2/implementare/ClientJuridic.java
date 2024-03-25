package D_banca.exercitiu2.implementare;

public class ClientJuridic extends Client{
    public ClientJuridic(String numeCreditor, int sumaCredit) {
        super(numeCreditor, sumaCredit);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClientJuridic{");
        sb.append(this.getNumeClient());
        sb.append(", ");
        sb.append(this.getSumaCredit());
        sb.append('}');
        return sb.toString();
    }
}
