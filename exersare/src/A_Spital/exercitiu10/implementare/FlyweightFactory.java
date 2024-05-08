package A_Spital.exercitiu10.implementare;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String,Flyweight> listaPacienti;

    public FlyweightFactory() {
        this.listaPacienti=new HashMap<>();
    }

    public Flyweight getPacient(String nume, String numarTelefon, String adresa){
        if(!listaPacienti.containsKey(nume)){
            listaPacienti.put(nume,new Pacient(adresa, numarTelefon, nume));
        }
        return listaPacienti.get(nume);
    }
}
