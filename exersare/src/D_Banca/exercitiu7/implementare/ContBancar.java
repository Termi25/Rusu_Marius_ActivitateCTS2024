package D_Banca.exercitiu7.implementare;

public class ContBancar {
    protected String numeCont;
    protected int varsta;
    protected boolean eCautat;
    protected boolean areCreante;

    public ContBancar(boolean areCreante, boolean eCautat,
                      String numeCont, int varsta) {
        this.areCreante = areCreante;
        this.eCautat = eCautat;
        this.numeCont = numeCont;
        this.varsta = varsta;
    }

    public void verificareVarsta(){
        System.out.println("Varsta clientului "
                +numeCont+" este confirmata a fi de "
                +varsta+" ani.");
    }

    public void verificareECautatDePolitie(){
        if(eCautat){
            System.out.println("Clientul "
                    +numeCont
                    +" este cautat de politie.");
        }else{
            System.out.println("Clientul "
                    +numeCont
                    +" nu este cautat de politie.");
        }
    }

    public void verificareCreanteAlteBanci(){
        if(areCreante){
            System.out.println("Clientul "
                    +numeCont
                    +" are creante la alte banci.");
        }else{
            System.out.println("Clientul "
                    +numeCont
                    +" nu are creante la alte banci.");
        }
    }
}
