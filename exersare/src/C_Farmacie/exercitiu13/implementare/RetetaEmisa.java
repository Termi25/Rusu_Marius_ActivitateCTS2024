package C_Farmacie.exercitiu13.implementare;

public class RetetaEmisa implements StareReteta{
    @Override
    public void schimbaStare(Reteta reteta) {
        reteta.setStareReteta(this);
    }
}
