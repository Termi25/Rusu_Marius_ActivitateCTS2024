package A_Spital.exercitiu12.implementare.observer;

public class Pacient implements Observer{
    private int numarPacient;
    private String numePacient;

    public Pacient(int numarPacient, String numePacient) {
        this.numarPacient = numarPacient;
        this.numePacient = numePacient;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Pacientul "+numePacient+ " a primit mesajul: "+mesaj);
    }
}
