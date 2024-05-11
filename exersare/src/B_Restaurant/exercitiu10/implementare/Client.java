package B_Restaurant.exercitiu10.implementare;

public class Client implements Flyweight {
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void rezervaMasa(MasaRezervata masaRezervata) {
        System.out.println("Clientul "+nume
                +" a rezervat masa "+masaRezervata);
    }
}
