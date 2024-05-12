package D_Banca.exercitiu10.implementare;

public class ContBancar {
    int numarCod;
    double sumaCont;

    public ContBancar(int numarCod, double sumaCont) {
        this.numarCod = numarCod;
        this.sumaCont = sumaCont;
    }

    @Override
    public String toString() {
        return "ContBancar{" +
                "numarCod=" + numarCod +
                ", sumaCont=" + sumaCont +
                '}';
    }
}
