package C_Farmacie.exercitiu11.implementare;

public class FacturaFarmacie {
    int codFactura;
    double valoareFactura;
    MetodaPlata metodaPlata;

    public FacturaFarmacie(int codFactura, double valoareFactura) {
        this.codFactura = codFactura;
        this.valoareFactura = valoareFactura;
        this.metodaPlata=new PlataCard();
    }

    public void setMetodaPlata(MetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void platesteFacturaFarmacie(){
        this.metodaPlata.plateste(valoareFactura);
    }
}
