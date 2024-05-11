package C_Farmacie.exercitiu12.implementare.subiect;

public class Farmacie extends Subiect{
    String denumire;

    public Farmacie(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void notificareOfertaMedicamente() {
        notificaTotiAbonatii("Farmacia "
                +denumire
                +" va aduce la cunostiinta oferte de pret pentru anumite medicamente.");
    }
}
