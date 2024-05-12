package D_Banca.exercitiu5.implementare.leasing;

public abstract class LeasingAbstract {
    int codLeasing;
    double sumaLeasing;
    int durataLeasing;

    public LeasingAbstract(int codLeasing, int durataLeasing, double sumaLeasing) {
        this.codLeasing = codLeasing;
        this.durataLeasing = durataLeasing;
        this.sumaLeasing = sumaLeasing;
    }

    public int getCodLeasing() {
        return codLeasing;
    }

    public int getDurataLeasing() {
        return durataLeasing;
    }

    public double getSumaLeasing() {
        return sumaLeasing;
    }

    public abstract void oferaLeasing();
}
