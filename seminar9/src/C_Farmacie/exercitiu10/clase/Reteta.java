package C_Farmacie.exercitiu10.clase;

public class Reteta {
    private String nume;
    private double sumaDePlata;
    private int numarMedicamente;

    public Reteta(String nume, double sumaDePlata, int numarMedicamente) {
        this.nume = nume;
        this.sumaDePlata = sumaDePlata;
        this.numarMedicamente = numarMedicamente;
    }

    public String getNume() {
        return nume;
    }

    public double getSumaDePlata() {
        return sumaDePlata;
    }

    public int getNumarMedicamente() {
        return numarMedicamente;
    }

    @Override
    public String toString() {
        return "reteta " + nume +
                " cu suma de plata " + sumaDePlata +
                " RON si " + numarMedicamente +
                " medicamente.";
    }
}
