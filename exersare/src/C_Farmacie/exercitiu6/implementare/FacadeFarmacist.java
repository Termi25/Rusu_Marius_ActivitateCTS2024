package C_Farmacie.exercitiu6.implementare;

public class FacadeFarmacist {
    Farmacist farmacist;

    public FacadeFarmacist(Farmacist farmacist) {
        this.farmacist = farmacist;
    }

    public void verificareTotala(){
        this.farmacist.verificaRetetaClient();
        this.farmacist.verificaMedicamenteSolicitate();
        this.farmacist.verificaCardSanatate();
    }
}
