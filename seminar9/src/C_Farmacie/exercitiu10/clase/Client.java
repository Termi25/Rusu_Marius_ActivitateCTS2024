package C_Farmacie.exercitiu10.clase;

public class Client implements Flyweight{
    private String nume;
    private String numarAsigurare;

    public Client(String nume, String numarAsigurare) {
        this.nume = nume;
        this.numarAsigurare = numarAsigurare;
    }

    @Override
    public void achizitionareReteta(Reteta reteta) {
        System.out.println(this.toString()+" achizitioneaza "+reteta.toString());
    }

    @Override
    public String toString() {
        return "Clientul "  + this.nume + ' ' +
                " cu numarul de asigurare " + this.numarAsigurare;
    }
}
