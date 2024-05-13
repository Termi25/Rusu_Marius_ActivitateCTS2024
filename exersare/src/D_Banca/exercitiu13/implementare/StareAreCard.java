package D_Banca.exercitiu13.implementare;

public class StareAreCard implements StareBancomat{
    @Override
    public void setareStare(Bancomat bancomat) {
        bancomat.setStareBancomat(this);
    }
}
