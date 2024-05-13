package E_Sportiv.exercitiu9.implementare;

public interface Componenta {
    void adauga(Componenta componenta);
    void sterge(Componenta componenta);
    Componenta get(int index);
    void afisare(String indent);
}
