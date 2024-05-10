package B_Restaurant.exercitiu8.implementare;

import java.util.ArrayList;
import java.util.List;

public class Subsectiune implements StructuraAbstracta{

    String denumire;
    List<StructuraAbstracta> lista;

    public Subsectiune(String denumire) {
        this.denumire = denumire;
        this.lista=new ArrayList<>();
    }

    public String getDenumire() {
        return denumire;
    }

    @Override
    public void adauga(StructuraAbstracta structuraAbstracta) {
        this.lista.add(structuraAbstracta);
    }

    @Override
    public void sterge(StructuraAbstracta structuraAbstracta) {
        this.lista.remove(structuraAbstracta);
    }

    @Override
    public StructuraAbstracta get(int index) {
        if(index>=0 && index<this.lista.size()){
            return this.lista.get(index);
        }
        return null;
    }

    @Override
    public void afisare(String indent) {
        System.out.println(indent+" Subsectiune- "+this.denumire);
        for(StructuraAbstracta structura:this.lista){
            structura.afisare(indent+indent);
        }
    }
}
