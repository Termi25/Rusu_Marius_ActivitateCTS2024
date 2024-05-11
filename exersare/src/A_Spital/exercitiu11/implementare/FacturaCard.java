package A_Spital.exercitiu11.implementare;

public class FacturaCard implements MetodaPlata {
    @Override
    public void realizeazaPlata(double suma, String nume) {
        System.out.println(nume+
                "a platit internarea in valoare de "
                        +suma+ " cu cardul");
    }
}
