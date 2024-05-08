package C_Farmacie.exercitiu13.implementare;

public class StareRetetaSolicitata implements StareReteta{
    @Override
    public void schimbaStare(Reteta reteta) {
        reteta.setStareReteta(this);
    }
}
