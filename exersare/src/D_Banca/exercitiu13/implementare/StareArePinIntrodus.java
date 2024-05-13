package D_Banca.exercitiu13.implementare;

public class StareArePinIntrodus implements StareBancomat{
    @Override
    public void setareStare(Bancomat bancomat) {
        bancomat.setStareBancomat(this);
    }
}
