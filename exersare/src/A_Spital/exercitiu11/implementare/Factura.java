package A_Spital.exercitiu11.implementare;

public class Factura{
    private String numePacient;
    private double sumaDePlatit;
    private MetodaPlata metodaPlata;

    public Factura(String numePacient, double sumaDePlatit) {
        this.numePacient = numePacient;
        this.sumaDePlatit = sumaDePlatit;
        this.metodaPlata=new FacturaCard();
    }

    public MetodaPlata getMetodaPlata() {
        return metodaPlata;
    }

    public void setMetodaPlata(MetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void printareFactura() {
        this.metodaPlata.realizeazaPlata(sumaDePlatit,numePacient);
    }
}
