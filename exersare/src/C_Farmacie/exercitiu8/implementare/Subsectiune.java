package C_Farmacie.exercitiu8.implementare;

import java.util.ArrayList;
import java.util.List;

public class Subsectiune implements Componenta {
    private List<Componenta> listaElemente;
    private String denumire;

    public Subsectiune(String denumire) {
        this.denumire=denumire;
        this.listaElemente=new ArrayList<>();
    }

    @Override
    public void adauga(Componenta componenta) {
        this.listaElemente.add(componenta);
    }

    @Override
    public void sterge(Componenta componenta) {
        this.listaElemente.remove(componenta);
    }

    @Override
    public Componenta get(int index) {
        if(index>=0 && index<this.listaElemente.size()){
            return this.listaElemente.get(index);
        }
        return null;
    }

    @Override
    public void afiseaza(String indent) {
        System.out.println(indent+" Subsectiunea - "+denumire);
        for(Componenta element:this.listaElemente){
            element.afiseaza(indent+indent+indent);
        }
    }
}
