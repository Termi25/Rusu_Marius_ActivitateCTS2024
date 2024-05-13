package D_Banca.exercitiu13.implementare;

public class StareNuAreCard implements StareBancomat{
    @Override
    public void setareStare(Bancomat bancomat) {
        bancomat.setStareBancomat(this);
    }
}
