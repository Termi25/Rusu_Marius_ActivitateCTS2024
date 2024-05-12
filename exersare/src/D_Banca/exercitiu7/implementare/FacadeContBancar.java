package D_Banca.exercitiu7.implementare;

public class FacadeContBancar {
    private ContBancar cont;

    public FacadeContBancar(ContBancar cont) {
        this.cont = cont;
    }

    public void verificareContCompleta(){
        this.cont.verificareVarsta();
        this.cont.verificareECautatDePolitie();
        this.cont.verificareCreanteAlteBanci();
    }
}
