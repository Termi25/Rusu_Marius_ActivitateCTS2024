package D_Banca.exercitiu14.implementare;


public abstract class TemplateBancomat {
    int codBancomat;
    String proprietar;
    double sumaBani;
    double sumaSpecificata;

    public TemplateBancomat(int codBancomat, String proprietar, double sumaBani) {
        this.codBancomat = codBancomat;
        this.proprietar = proprietar;
        this.sumaBani = sumaBani;
    }

    public void retrageBaniDinCard(double sumaCeruta){
        introduceCardul();
        introduceCodulPin();
        specificaSumaDeRetras(sumaCeruta);
        retrageBanii();
        retrageCardul();
    }

    protected abstract void introduceCardul();

    protected abstract void introduceCodulPin();

    protected abstract void specificaSumaDeRetras(double sumaCeruta);

    protected abstract void retrageBanii();

    protected abstract void retrageCardul();
}
