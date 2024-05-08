package A_Spital.exercitiu9.implementare;

public class Persoana {
    private String nume;

    private boolean AreAsigurare;

    public Persoana(boolean areAsigurare, String nume) {
        AreAsigurare = areAsigurare;
        this.nume = nume;
    }

    public boolean areAsigurare() {
        return AreAsigurare;
    }

    public String getNume() {
        return nume;
    }
}
