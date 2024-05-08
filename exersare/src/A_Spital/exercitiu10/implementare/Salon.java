package A_Spital.exercitiu10.implementare;

public class Salon {
    private int numarSalon;
    private int numarPat;
    private int numarZileSpitalizare;

    public Salon(int numarPat, int numarSalon, int numarZileSpitalizare) {
        this.numarPat = numarPat;
        this.numarSalon = numarSalon;
        this.numarZileSpitalizare = numarZileSpitalizare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(numarSalon);
        sb.append("in patul ").append(numarPat);
        sb.append(" pentru ").append(numarZileSpitalizare).append(" zile.");
        return sb.toString();
    }
}
