package C_Farmacie.exercitiu8.implementare;

public interface Componenta {
    void adauga(Componenta componenta);
    void sterge(Componenta componenta);
    Componenta get(int index);
    void afiseaza(String indent);
}
