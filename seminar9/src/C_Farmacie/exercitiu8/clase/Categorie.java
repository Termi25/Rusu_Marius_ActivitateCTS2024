package C_Farmacie.exercitiu8.clase;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements StructuraAbstracta{
    private String denumireCategorie;
    private List<StructuraAbstracta> medicamente;

    public Categorie(String denumireCategorie) {
        this.denumireCategorie = denumireCategorie;
        this.medicamente=new ArrayList<>();
    }

    public String getDenumireCategorie() {
        return denumireCategorie;
    }

    @Override
    public void adauga(StructuraAbstracta structura) {
        this.medicamente.add(structura);
    }

    @Override
    public void sterge(StructuraAbstracta structura) {
        this.medicamente.remove(structura);
    }

    @Override
    public StructuraAbstracta get(int index) {
        if(index>=0 && index<this.medicamente.size()){
            return this.medicamente.get(index);
        }
        return null;
    }

    @Override
    public void afisare(String indent) {
        System.out.println(indent+"| Categoria "+this.denumireCategorie);
        for(StructuraAbstracta medicament:this.medicamente){
            medicament.afisare(indent+indent);
        }
    }

    @Override
    public void calculeazaPret(double procentDiscount) {
        for(StructuraAbstracta medicament:this.medicamente){
            medicament.calculeazaPret(procentDiscount);
        }
    }
}
