package B_Restaurant.exercitiu11.implementare;

public class PlataCash implements MetodaPlata{
    @Override
    public void plateste(String nume, int masa, double suma) {
        System.out.println("Clientul "
                +nume+
                " de la masa "
                +masa
                +" a platit cash nota in valoare de "
                +suma);
    }
}
