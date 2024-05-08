package A_Spital.exercitiu11.implementare.decoratoare;

import A_Spital.exercitiu11.implementare.clase.Factura;
import A_Spital.exercitiu11.implementare.clase.FacturaAbstracta;

public abstract class DecoratorFactura extends FacturaAbstracta {

    private FacturaAbstracta facturaAbstracta;

    public DecoratorFactura(String numePacient, float sumaDePlatit) {
        super(numePacient, sumaDePlatit);
        this.facturaAbstracta=new Factura(numePacient,sumaDePlatit);
    }

    public DecoratorFactura(FacturaAbstracta facturaAbstracta){
        super(facturaAbstracta.getNumePacient(), facturaAbstracta.getSumaDePlatit());
        this.facturaAbstracta=facturaAbstracta;
    }

    public FacturaAbstracta getFacturaAbstracta() {
        return facturaAbstracta;
    }

    public abstract void platesteFactura();
}
