package E_Sportiv.exercitiu6.implementare;

public class FacadeOperator {
    private Operator operator;

    public FacadeOperator(Operator operator) {
        this.operator = operator;
    }

    public void verificaTotalPersoana(Persoana persoana){
        this.operator
                .verificaBuletin(persoana);
        this.operator
                .verificaEsteCautataPersoana(persoana);
        this.operator
                .verificaAAvutAntecedentePersoana(persoana);
    }
}
