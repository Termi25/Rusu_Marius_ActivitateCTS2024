package B_Restaurant.exercitiu13.implementare;

public class MasaRezervata implements StareMasa{
    @Override
    public void schimbaStare(MasaRestaurant masa) {
        masa.setStareMasa(this);
    }
}
