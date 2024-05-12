package D_Banca.exercitiu13.implementare;

import D_Banca.exercitiu13.implementare.stari_bancomat.*;

public class Bancomat {
    int codBancomat;
    String proprietar;
    StareBancomat stareBancomat;
    double sumaBani;

    public Bancomat(int codBancomat, String proprietar, double sumaBani) {
        this.codBancomat = codBancomat;
        this.proprietar = proprietar;
        this.stareBancomat = new StareNuAreCard();
        this.sumaBani = sumaBani;
    }

    public void setStareBancomat(StareBancomat stareBancomat) {
        this.stareBancomat = stareBancomat;
    }

    public void introducereCard(){
        if(this.stareBancomat instanceof StareNuAreCard){
            StareBancomat stareAreCard=new StareAreCard();
            stareAreCard.setareStare(this);
            System.out.println("S-a introdus cardul.");
        }else{
            System.out.println("Nu se pot efectua operatiuni.");
        }
    }

    public void introducereCodPin(){
        if(this.stareBancomat instanceof StareAreCard){
            StareBancomat stareArePinIntrodus=
                    new StareArePinIntrodus();
            stareArePinIntrodus.setareStare(this);
            System.out.println("S-a introdus codul PIN.");
        }else{
            System.out.println("Nu se pot efectua operatiuni.");
        }
    }

    public void retragereBani(double sumaCeruta){
        if(this.stareBancomat instanceof StareArePinIntrodus){
            if(sumaCeruta>sumaBani){
                StareBancomat stareNuAreBani= new StareNuAreBani();
                stareNuAreBani.setareStare(this);
                System.out.println("S-a retras suma de "+sumaBani);
            }else{
                StareBancomat stareNuAreCard= new StareNuAreCard();
                stareNuAreCard.setareStare(this);
                System.out.println("S-a retras suma de "+sumaCeruta);
            }
        }else{
            System.out.println("Nu se pot efectua operatiuni.");
        }
    }
}
