package E_Sportiv.exercitiu10.implementare;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    Map<Integer,Flyweight> listaPersoane;

    public FlyweightFactory() {
        this.listaPersoane=new HashMap<>();
    }

    public Flyweight get(int codPersoana, int inaltime, int latime,
                         int loc, int rand, String culoareTricou){
        if(!this.listaPersoane.containsKey(codPersoana)){
            this.listaPersoane.put(codPersoana,
                    new Persoana(codPersoana,
                            inaltime,
                            latime,
                            loc,
                            rand,
                            culoareTricou));
        }
        return this.listaPersoane.get(codPersoana);
    }
}
