package A_Spital.exercitiu11.implementare.clase;

public class Factura extends FacturaAbstracta{
    public Factura(String numePacient, double sumaDePlatit) {
        super(numePacient, sumaDePlatit);
    }

    @Override
    public void printareFactura() {
        System.out.println(this.getNumePacient()
                +" a platit internarea in valoare de "
                +this.getSumaDePlatit()+" RON.");
    }
}
