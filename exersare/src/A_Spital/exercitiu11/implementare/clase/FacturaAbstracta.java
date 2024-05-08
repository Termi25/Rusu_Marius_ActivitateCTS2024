package A_Spital.exercitiu11.implementare.clase;

import java.util.StringJoiner;

public abstract class FacturaAbstracta {
    private String numePacient;
    private double sumaDePlatit;

    public FacturaAbstracta(String numePacient, double sumaDePlatit) {
        this.numePacient = numePacient;
        this.sumaDePlatit = sumaDePlatit;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public double getSumaDePlatit() {
        return sumaDePlatit;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", FacturaAbstracta.class.getSimpleName() + "[", "]")
                .add("numePacient='" + numePacient + "'")
                .add("sumaDePlatit=" + sumaDePlatit)
                .toString();
    }

    public abstract void printareFactura();
}
