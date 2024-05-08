package A_Spital.exercitiu8.implementare;

import java.util.ArrayList;
import java.util.List;

public class Departament implements StructuraAbstracta {
    String nume;
    List<StructuraAbstracta> listaSubdepartamenteSiSectii;

    public Departament(String nume) {
        this.nume = nume;
        this.listaSubdepartamenteSiSectii=new ArrayList<>();
    }


    @Override
    public void adauga(StructuraAbstracta structura) {
        this.listaSubdepartamenteSiSectii.add(structura);
    }

    @Override
    public void sterge(StructuraAbstracta structura) {
        this.listaSubdepartamenteSiSectii.remove(structura);
    }

    @Override
    public StructuraAbstracta get(int index) {
        if(index>=0 && index<this.listaSubdepartamenteSiSectii.size()){
            return this.listaSubdepartamenteSiSectii.get(index);
        }
        return null;
    }

    @Override
    public void afisare(String indent) {
        System.out.println(indent+"| Categoria "
                +this.nume);
        for(StructuraAbstracta sectie:this.listaSubdepartamenteSiSectii){
            sectie.afisare(indent+indent);
        }
    }
}
