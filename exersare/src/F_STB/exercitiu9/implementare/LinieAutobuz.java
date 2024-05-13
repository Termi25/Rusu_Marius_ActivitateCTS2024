package F_STB.exercitiu9.implementare;

public class LinieAutobuz implements Flyweight{
    private int numarLinie;
    private String primaStatie;
    private String ultimaStatie;

    public LinieAutobuz(int numarLinie, String primaStatie,
                        String ultimaStatie) {
        this.numarLinie = numarLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public void inregistrareAutobuz(AutobuzLinie autobuzLinie) {
        System.out.println("Autobuzul "
                +autobuzLinie.getModelAutobuz()
                +" a fost inregistrat pentru linia "+
                numarLinie);
    }
}
