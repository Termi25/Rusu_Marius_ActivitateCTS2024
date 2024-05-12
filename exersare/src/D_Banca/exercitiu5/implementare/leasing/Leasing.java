package D_Banca.exercitiu5.implementare.leasing;

public class Leasing extends LeasingAbstract{
    public Leasing(int codLeasing, int durataLeasing, double sumaLeasing) {
        super(codLeasing, durataLeasing, sumaLeasing);
    }

    @Override
    public void oferaLeasing() {
        System.out.println("Se ofera leasing-ul pe "+durataLeasing
                +" luni in valoare de "+sumaLeasing);
    }
}
