package C_Farmacie.exercitiu10.implementare;

public class Client implements Flyweight{
    String nume;
    int numarAsigurare;

    public Client(int numarAsigurare, String nume) {
        this.numarAsigurare = numarAsigurare;
        this.nume = nume;
    }

    @Override
    public void platesteReteta(Reteta reteta) {
        System.out.println("Clientul "+nume
                +" a platit reteta "+reteta);
    }
}
