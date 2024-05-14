package D_Banca.exercitiu8.implementare;

public class CreditProxy implements CreditAbstract{
    private CreditAbstract credit;

    public CreditProxy(CreditAbstract credit) {
        this.credit = credit;
    }

    @Override
    public void realizeazaCredit() {
        if(this.credit.getMoneda().equalsIgnoreCase("RON")){
            this.credit.realizeazaCredit();
        }else{
            System.out.println("Nu se poate realiza credit decat in RON.");
        }
    }

    @Override
    public String getMoneda() {
        return this.credit.getMoneda();
    }
}
