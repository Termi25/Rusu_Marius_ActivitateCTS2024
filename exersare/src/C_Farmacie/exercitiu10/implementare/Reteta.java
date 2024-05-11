package C_Farmacie.exercitiu10.implementare;

public class Reteta {
    int numarReteta;
    double sumaDePlata;
    int numarMedicamente;

    public Reteta(int numarMedicamente,
                  int numarReteta, double sumaDePlata) {
        this.numarMedicamente = numarMedicamente;
        this.numarReteta = numarReteta;
        this.sumaDePlata = sumaDePlata;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "numarMedicamente=" + numarMedicamente +
                ", numarReteta=" + numarReteta +
                ", sumaDePlata=" + sumaDePlata +
                '}';
    }
}
