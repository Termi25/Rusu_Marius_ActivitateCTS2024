package B_restaurant.exercitiu3.main;


import B_restaurant.exercitiu3.implementare.FactorySupe;
import B_restaurant.exercitiu3.implementare.Supa;
import B_restaurant.exercitiu3.implementare.TipuriSupe;

public class Main3 {
    public static void main(String[] args) {
        FactorySupe factorySupe=new FactorySupe();
        Supa supaVita= factorySupe.creareSupa(TipuriSupe.SupaVita,"supa vita",400);
        System.out.println(supaVita);
    }
}
