package B_Restaurant.exercitiu8.implementare;

public interface StructuraAbstracta {
    void adauga (StructuraAbstracta structuraAbstracta);
    void sterge (StructuraAbstracta structuraAbstracta);
    StructuraAbstracta get (int index);
    void afisare(String indent);
}
