package D_Banca.exercitiu14.implementare;

public class Bancomat extends TemplateBancomat{
    public Bancomat(int codBancomat, String proprietar, double sumaBani) {
        super(codBancomat, proprietar, sumaBani);
    }

    @Override
    public void introduceCardul() {
        System.out.println("S-a introdus cardul.");
    }

    @Override
    public void introduceCodulPin() {
        System.out.println("S-a introdus codul PIN.");
    }

    @Override
    public void specificaSumaDeRetras(double sumaCeruta) {
        this.sumaSpecificata=sumaCeruta;
    }

    @Override
    public void retrageBanii() {
        this.sumaBani-=this.sumaSpecificata;
        System.out.println("S-au retras banii.");
    }

    @Override
    public void retrageCardul() {
        System.out.println("S-a retras cardul.");
    }
}
