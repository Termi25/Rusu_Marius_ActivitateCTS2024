package D_Banca.exercitiu6.implementare.clase;

public abstract class CardAbstract {
    protected String numeCard;
    protected int codCard;
    protected String dataExpirare;

    public CardAbstract(int codCard, String dataExpirare, String numeCard) {
        this.codCard = codCard;
        this.dataExpirare = dataExpirare;
        this.numeCard = numeCard;
    }

    public int getCodCard() {
        return codCard;
    }

    public String getDataExpirare() {
        return dataExpirare;
    }

    public String getNumeCard() {
        return numeCard;
    }

    public abstract void platesteOnline();
    public abstract void platesteNormal();
}
