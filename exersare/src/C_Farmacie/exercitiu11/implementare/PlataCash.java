package C_Farmacie.exercitiu11.implementare;

public class PlataCash implements MetodaPlata{
    @Override
    public void plateste(double valoare) {
        System.out.println("Factura in valoare de "
                +valoare+ " a fost platit cash.");
    }
}
