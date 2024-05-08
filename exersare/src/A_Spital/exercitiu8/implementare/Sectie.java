package A_Spital.exercitiu8.implementare;

public class Sectie extends SubdepartamentAbstract implements StructuraAbstracta{
    public Sectie(String nume) {
        super(nume);
    }

    @Override
    public void adauga(StructuraAbstracta structura) {
        throw new RuntimeException();
    }

    @Override
    public void sterge(StructuraAbstracta structura) {
        throw new RuntimeException();
    }

    @Override
    public StructuraAbstracta get(int index) {
        throw new RuntimeException();
    }

    @Override
    public void afisare(String indent) {
        System.out.println(indent+"Sectie "+this);
    }
}
