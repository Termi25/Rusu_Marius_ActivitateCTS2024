package F_STB.exercitiu6.implementare;

public class Autobuz implements Componenta{
    private String producator;
    private String model;
    private int numarLocuri;

    public Autobuz(String producator,
                   String model, int numarLocuri) {
        this.producator = producator;
        this.model = model;
        this.numarLocuri = numarLocuri;
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
        System.out.println(indent+" Autobuz: "+model);
    }
}
