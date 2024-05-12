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

    public abstract void introduceCardul();

    public abstract void introduceCodulPin();

    public abstract void specificaSumaDeRetras(double sumaCeruta);

    public abstract void retrageBanii();

    public abstract void retrageCardul();
}
