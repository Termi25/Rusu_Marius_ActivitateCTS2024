package D_Banca.exercitiu6.implementare.clase;

public class CardBancar extends CardAbstract{
    public CardBancar(int codCard, String dataExpirare, String numeCard) {
        super(codCard, dataExpirare, numeCard);
    }

    @Override
    public void platesteOnline() {
        System.out.println("S-a utilizat la plata online cardul cu numarul "
                +codCard+" detinut de "
                +numeCard+" care expira la data de "
                +dataExpirare);
    }

    @Override
    public void platesteNormal() {
        System.out.println("S-a utilizat la plata normala cardul cu numarul "
                +codCard+" detinut de "
                +numeCard+" care expira la data de "
                +dataExpirare);
    }
}
