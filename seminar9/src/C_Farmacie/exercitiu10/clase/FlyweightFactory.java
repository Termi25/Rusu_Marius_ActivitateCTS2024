package C_Farmacie.exercitiu10.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String,Flyweight> listaClienti;

    public FlyweightFactory() {
        this.listaClienti =new HashMap<>();
    }
    public Flyweight getClient(String nume, String numarAsigurare){
        if(!listaClienti.containsKey(numarAsigurare)){
            listaClienti.put(nume,new Client(nume,numarAsigurare));
        }
        return listaClienti.get(nume);
    }
}
