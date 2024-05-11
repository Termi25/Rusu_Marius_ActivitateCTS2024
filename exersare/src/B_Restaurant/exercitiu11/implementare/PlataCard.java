package B_Restaurant.exercitiu11.implementare;

public class PlataCard implements MetodaPlata{
    @Override
    public void plateste(String nume, int masa,
                         double suma) {
        System.out.println("Clientul "
                +nume+
                " de la masa "
                +masa
                +" a platit cu cardul nota in valoare de "
                +suma);
    }
}
