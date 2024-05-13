package D_Banca.exercitiu13.implementare;

public class StareNuAreBani implements StareBancomat{
    @Override
    public void setareStare(Bancomat bancomat) {
        bancomat.setStareBancomat(this);
    }
}
