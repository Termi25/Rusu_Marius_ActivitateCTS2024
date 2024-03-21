package restaurant.exercitiu1.main;

import restaurant.exercitiu1.implementare.*;

public class Main1 {
    public static void main(String[] args) {
        Factory factorySupaVita=new FactorySupaVita();
        Supa supaVita=factorySupaVita.creareSupa("Ciorba de vacuta",400);
        System.out.println(supaVita);

        Factory factorySupaLegume=new FactorySupaLegume();
        Supa supaLegume=factorySupaLegume.creareSupa("Supa cu spanac",300);
        System.out.println(supaLegume);

        Factory factorySupaCiuperci=new FactorySupaCiuperci();
        Supa supaCiuperci=factorySupaCiuperci.creareSupa("Supa cu ciurperci maro",200);
        System.out.println(supaCiuperci);
    }
}
