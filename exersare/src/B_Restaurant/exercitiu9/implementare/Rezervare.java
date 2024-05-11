package B_Restaurant.exercitiu9.implementare;

public class Rezervare implements RezervareAbstracta{
    int numarPersoane;
    String numeRezervare;
    String oraRezervare;
    String dataRezervare;

    public Rezervare(int numarPersoane, String numeRezervare, String dataRezervare, String oraRezervare) {
        this.dataRezervare = dataRezervare;
        this.numarPersoane = numarPersoane;
        this.numeRezervare = numeRezervare;
        this.oraRezervare = oraRezervare;
    }

    @Override
    public void realizareRezervare() {
        System.out.println("Rezervare in numele "
                +numeRezervare+" pentru "+numarPersoane
                +" persoane "+ " a fost facuta pentru ora "
                +oraRezervare+ "in data de "+dataRezervare);
    }
}
