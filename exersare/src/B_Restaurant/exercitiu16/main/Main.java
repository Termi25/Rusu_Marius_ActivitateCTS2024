package B_Restaurant.exercitiu16.main;

import B_Restaurant.exercitiu16.implementare.observer.Client;
import B_Restaurant.exercitiu16.implementare.observer.Observer;
import B_Restaurant.exercitiu16.implementare.subiect.Restaurant;
import B_Restaurant.exercitiu16.implementare.subiect.Subiect;

public class Main {
    public static void main(String[] args) {
        Subiect restaurant=new Restaurant("PizzaHut");
        Observer client1=new Client("Manole",null,null);
        Observer client2=new Client("Popescu","popescu21@gmail.com",null);
        Observer client3=new Client("Dobrescu",null,"0797776097");

        restaurant.aboneazaClient(client1);
        restaurant.aboneazaClient(client2);
        restaurant.aboneazaClient(client3);

        restaurant.notificaTotiClientii(" Schimbare politica restaurant ");

    }
}
