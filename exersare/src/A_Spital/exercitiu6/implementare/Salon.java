package A_Spital.exercitiu6.implementare;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    List<Integer> listaStatusPaturi;
    int codSalon;

    public Salon(int codSalon) {
        this.codSalon = codSalon;
        this.listaStatusPaturi=new ArrayList<>();
        this.listaStatusPaturi.add(0);
        this.listaStatusPaturi.add(0);
        this.listaStatusPaturi.add(0);
    }

    public boolean verificaDisponibilitatePat(){
        for(int i=0;i< this.listaStatusPaturi.size();i++){
            if(this.listaStatusPaturi.get(i)==0){
                this.listaStatusPaturi.set(i,1);
                return true;
            }
        }
        return false;
    }
}
