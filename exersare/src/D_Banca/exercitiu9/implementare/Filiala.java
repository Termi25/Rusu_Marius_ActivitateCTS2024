package D_Banca.exercitiu9.implementare;

public class Filiala implements Componenta{
    String denumire;

    public Filiala(String denumire) {
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
    public void afisare(String indent) {
        System.out.println(indent+"|-> "+denumire);
    }
}
