package F_STB.exercitiu6.implementare;

import java.util.ArrayList;
import java.util.List;

public class GrupDimensiuneAutobuz implements Componenta{
    private String denumire;
    private List<Componenta> listaAutobuze;

    public GrupDimensiuneAutobuz(String denumire) {
        this.denumire=denumire;
        this.listaAutobuze = new ArrayList<>();
    }

    @Override
    public void adauga(Componenta componenta) {
        this.listaAutobuze.add(componenta);
    }

    @Override
    public void sterge(Componenta componenta) {
        this.listaAutobuze.add(componenta);
    }

    @Override
    public Componenta get(int index) {
        if(index>=0 && index<this.listaAutobuze.size()){
            return this.listaAutobuze.get(index);
        }
        return null;
    }

    @Override
    public void afisare(String indent) {
        System.out.println(indent+" Grup dimensiune autobuz - "+denumire);
        for(Componenta grup:this.listaAutobuze){
            grup.afisare(indent+indent+indent);
        }
    }
}
