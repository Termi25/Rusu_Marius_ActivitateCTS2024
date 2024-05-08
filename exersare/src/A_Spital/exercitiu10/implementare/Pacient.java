package A_Spital.exercitiu10.implementare;

public class Pacient implements Flyweight{
    private String nume;
    private String numarTelefon;
    private String adresa;

    public Pacient(String adresa, String numarTelefon, String nume) {
        this.adresa = adresa;
        this.numarTelefon = numarTelefon;
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("adresa='").append(adresa).append('\'');
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void internareSpital(Salon salon) {
        System.out.println("Pacientul "+nume+" este internat in salonul "+salon.toString());
    }
}
