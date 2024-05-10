package B_Restaurant.exercitiu8.implementare;

import java.util.ArrayList;
import java.util.List;

public class Item implements StructuraAbstracta{
    String denumire;
    List<StructuraAbstracta> lista;

    public Item(String denumire) {
        this.denumire = denumire;
        this.lista=new ArrayList<>();
    }

    public String getDenumire() {
        return denumire;
    }

    @Override
    public void adauga(StructuraAbstracta structuraAbstracta) {
        throw new RuntimeException();
    }

    @Override
    public void sterge(StructuraAbstracta structuraAbstracta) {
        throw new RuntimeException();
    }

    @Override
    public StructuraAbstracta get(int index) {
        throw new RuntimeException();
    }

    @Override
    public void afisare(String indent) {
        System.out.println(indent+" Item- "+this.denumire);
    }
}
