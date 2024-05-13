package F_STB.exercitiu9.implementare;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<Integer,Flyweight> listaLinii;

    public FlyweightFactory() {
        this.listaLinii=new HashMap<>();
    }

    public Flyweight get(int numarLinie, String primaStatie,
                         String ultimaStatie){
        if(!this.listaLinii.containsKey(numarLinie)){
            this.listaLinii.put(numarLinie,
                    new LinieAutobuz(
                            numarLinie,
                            primaStatie,
                            ultimaStatie
                    ));
        }
        return this.listaLinii.get(numarLinie);
    }
}
