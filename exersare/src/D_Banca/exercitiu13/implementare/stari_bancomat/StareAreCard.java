package D_Banca.exercitiu13.implementare.stari_bancomat;

import D_Banca.exercitiu13.implementare.Bancomat;

public class StareAreCard implements StareBancomat{
    @Override
    public void setareStare(Bancomat bancomat) {
        bancomat.setStareBancomat(this);
    }
}
