package A_Spital.exercitiu12.implementare.subject;

public class Spital extends Subiect{
    private String adresa;

    public Spital(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public void notificarePacientiVirus() {
        notificarePacientiAbonati("Spitalul de la adresa "
                +this.adresa
                + " a descoperit prezenta unui virus nou.");
    }
}
