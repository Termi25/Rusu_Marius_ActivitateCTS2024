package D_Banca.exercitiu10.implementare;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    Map<String,Flyweight> listaClienti;

    public FlyweightFactory() {
        this.listaClienti = new HashMap<>();
    }

    public Flyweight getClient(String nume, String adresa,
                     String numarTelefon,
                     String adresaMail, Banca banca){
        if(!this.listaClienti.containsKey(nume)){
            this.listaClienti.put(nume,
                    new ClientBanca(nume,
                            adresa,
                            numarTelefon,
                            adresaMail,
                            banca));
        }
        return this.listaClienti.get(nume);
    }
}
