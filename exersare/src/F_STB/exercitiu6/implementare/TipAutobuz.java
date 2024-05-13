package F_STB.exercitiu6.implementare;

import java.util.ArrayList;
import java.util.List;

public class TipAutobuz implements Componenta{

    private String denumire;
    private List<Componenta> listaGrupuriAutobuze;

    public TipAutobuz(String denumire) {
        this.denumire=denumire;
        this.listaGrupuriAutobuze = new ArrayList<>();
    }

    @Override
    public void adauga(Componenta componenta) {
        this.listaGrupuriAutobuze.add(componenta);
    }

    @Override
    public void sterge(Componenta componenta) {
        this.listaGrupuriAutobuze.add(componenta);
    }

    @Override
    public Componenta get(int index) {
        if(index>=0 && index<this.listaGrupuriAutobuze.size()){
            return this.listaGrupuriAutobuze.get(index);
        }
        return null;
    }

    @Override
    public void afisare(String indent) {
        System.out.println(indent+" Tip autobuz - "+denumire);
        for(Componenta grup:this.listaGrupuriAutobuze){
            grup.afisare(indent+indent+indent);
        }
    }
}
