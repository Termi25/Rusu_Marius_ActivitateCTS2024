package B_Restaurant.exercitiu10.implementare;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private Map<String,Flyweight> listaClienti;

    public FlyweightFactory(){
        this.listaClienti=new HashMap<>();
    }

    public Flyweight getClient(String nume){
        if(!this.listaClienti.containsKey(nume)){
            this.listaClienti.put(nume,new Client(nume));
        }
        return this.listaClienti.get(nume);
    }
}
