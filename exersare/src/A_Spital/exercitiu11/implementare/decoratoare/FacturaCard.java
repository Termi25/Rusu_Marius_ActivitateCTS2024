package A_Spital.exercitiu11.implementare.decoratoare;

import A_Spital.exercitiu11.implementare.clase.FacturaAbstracta;

public class FacturaCard extends DecoratorFactura{
    public FacturaCard(FacturaAbstracta facturaAbstracta) {
        super(facturaAbstracta);
    }

    public FacturaCard(String numePacient, float sumaDePlatit) {
        super(numePacient, sumaDePlatit);
    }

    @Override
    public void platesteFactura() {
        printareFactura();
    }

    @Override
    public void printareFactura() {
        System.out.println(this.getNumePacient()
                +" a platit internarea cu cardul valoarea de "
                +this.getSumaDePlatit()+" RON");
    }
}
