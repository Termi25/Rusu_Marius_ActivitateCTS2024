package B_Restaurant.exercitiu6.implementare;

import java.util.ArrayList;
import java.util.List;

public class Receptionist {
    List<Integer> listaMese;

    public Receptionist() {
        this.listaMese = new ArrayList<>();
        this.listaMese.add(0);
        this.listaMese.add(0);
        this.listaMese.add(0);
        this.listaMese.add(1);
        this.listaMese.add(1);
    }

    public boolean verificaDisponibilitateMasa(){
        return this.listaMese.contains(0);
    }

    public void verificaDebarasareMasa(){
        System.out.println("S-a debarasat masa.");
    }

    public void verificaServeteleMasa(){
        System.out.println("S-au pus servetele pe masa");
    }
}
