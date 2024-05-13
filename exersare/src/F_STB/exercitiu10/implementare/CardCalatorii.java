package F_STB.exercitiu10.implementare;

public class CardCalatorii implements MetodaPlata{
    @Override
    public void platesteCalatorie(String nume) {
        System.out.println("Calatorul "
                +nume
                +" a platit calatoria cu cardul de calatorii.");
    }
}
