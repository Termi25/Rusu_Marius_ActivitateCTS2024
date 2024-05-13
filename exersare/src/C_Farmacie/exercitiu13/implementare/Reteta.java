package C_Farmacie.exercitiu13.implementare;

public class Reteta {
    int codReteta;
    int numarMedicamente;
    StareReteta stareReteta;

    public Reteta(int codReteta, int numarMedicamente) {
        this.codReteta = codReteta;
        this.numarMedicamente = numarMedicamente;
        this.stareReteta=new RetetaEmisa();
    }

    protected void setStareReteta(StareReteta stareReteta) {
        this.stareReteta = stareReteta;
    }

    public void cereMedicamente(){
        if(this.stareReteta instanceof RetetaEmisa){
            StareReteta stareSolicitata=new RetetaSolicitata();
            stareSolicitata.schimbaStare(this);
            System.out.println("Medicamentele retetei cu codul "
                    +codReteta +" au fost solicitate.");
        }else{
            System.out.println("Medicamentele retetei cu codul "
                    +codReteta +" nu pot fi solicitate.");
        }
    }

    public void cumparaMedicamente(){
        if(this.stareReteta instanceof RetetaSolicitata){
            StareReteta stareAchizitionata=new RetetaAchizitionata();
            stareAchizitionata.schimbaStare(this);
            System.out.println("Medicamentele retetei cu codul "
                    +codReteta +" au fost achizitionate.");
        }else{
            System.out.println("Medicamentele retetei cu codul "
                    +codReteta +" nu pot fi achizitionate.");
        }
    }
}
