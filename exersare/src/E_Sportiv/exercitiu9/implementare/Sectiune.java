package E_Sportiv.exercitiu9.implementare;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Componenta{
    List<Componenta> listaComponente;
    String denumire;

    public Sectiune(String denumire) {
        this.denumire=denumire;
        this.listaComponente=new ArrayList<>();
    }

    @Override
    public void adauga(Componenta componenta) {
        this.listaComponente.add(componenta);
    }

    @Override
    public void sterge(Componenta componenta) {
        this.listaComponente.remove(componenta);
    }

    @Override
    public Componenta get(int index) {
        if(index>=0 && index<this.listaComponente.size()){
            return this.listaComponente.get(index);
        }
        return null;
    }

    @Override
    public void afisare(String indent) {
        System.out.println(indent+" Sectiune: "+denumire);
        for(Componenta componenta:this.listaComponente){
            componenta.afisare(indent+indent+indent);
        }
    }
}
