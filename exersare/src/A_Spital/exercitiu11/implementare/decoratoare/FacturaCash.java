package A_Spital.exercitiu11.implementare.decoratoare;

import A_Spital.exercitiu11.implementare.clase.FacturaAbstracta;

public class FacturaCash extends DecoratorFactura{
    public FacturaCash(FacturaAbstracta facturaAbstracta) {
        super(facturaAbstracta);
    }

    public FacturaCash(String numePacient, float sumaDePlatit) {
        super(numePacient, sumaDePlatit);
    }

    @Override
    public void platesteFactura() {
        printareFactura();
    }

    @Override
    public void printareFactura() {
        System.out.println(this.getNumePacient()
                +" a platit internarea in cash valoarea de "
                +this.getSumaDePlatit()+" RON");
    }
}
