package C_Farmacie.exercitiu10.implementare;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    Map<Integer,Flyweight> listaClienti;

    public FlyweightFactory() {
        this.listaClienti = new HashMap<>();
    }

    public Flyweight getClient(String nume, int numarAsigurare){
        if(!this.listaClienti.containsKey(numarAsigurare)){
            this.listaClienti.put(numarAsigurare,new Client(numarAsigurare,nume));
        }
        return this.listaClienti.get(numarAsigurare);
    }
}
