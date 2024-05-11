package B_Restaurant.exercitiu12.main;

import B_Restaurant.exercitiu12.implementare.observer.Client;
import B_Restaurant.exercitiu12.implementare.observer.Observer;
import B_Restaurant.exercitiu12.implementare.subject.Restaurant;
import B_Restaurant.exercitiu12.implementare.subject.Subiect;

public class Main {
    public static void main(String[] args) {
        Observer client1=new Client("Popescu");
        Observer client2=new Client("Manole");

        Subiect restaurant=new Restaurant("PizzaHut");
        restaurant.abonareClient(client1);
        restaurant.abonareClient(client2);
        restaurant.notificareMeniuNou();
    }
}
