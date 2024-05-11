package B_Restaurant.exercitiu13.main;

import B_Restaurant.exercitiu13.implementare.MasaRestaurant;

public class Main {
    public static void main(String[] args) {
        MasaRestaurant masa=new MasaRestaurant(1);

        masa.rezervareMasa();
        masa.ocupareMasa();
        masa.eliberareMasa();

        masa.ocupareMasa();
    }
}
