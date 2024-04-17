package C_Farmacie.exercitiu8.clase;

public interface StructuraAbstracta {
    public void adauga(StructuraAbstracta structura);
    public void sterge(StructuraAbstracta structura);
    public StructuraAbstracta get(int index);
    public void afisare(String indent);
    public void calculeazaPret(double procentDiscount);
}
