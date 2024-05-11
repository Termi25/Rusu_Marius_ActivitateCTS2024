package C_Farmacie.exercitiu8.implementare;

public class Medicament implements Componenta{
    String denumire;

    public Medicament(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void adauga(Componenta componenta) {
        throw new RuntimeException();
    }

    @Override
    public void sterge(Componenta componenta) {
        throw new RuntimeException();
    }

    @Override
    public Componenta get(int index) {
        throw new RuntimeException();
    }

    @Override
    public void afiseaza(String indent) {
        System.out.println(indent+"| Medicament -> "+denumire);
    }
}
