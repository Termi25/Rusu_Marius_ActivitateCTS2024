package E_Sportiv.exercitiu12.implementare.subiect;

public class SalaSport extends Subiect{
    String denumire;

    public SalaSport(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void notificareMeciFotbal() {
        notificaAbonati("S-a programat un meci nou de fotbal.");
    }

    @Override
    public void notificareMeciHandbal() {
        notificaAbonati("S-a programat un meci nou de handbal.");
    }

    @Override
    public void notificareMeciVolei() {
        notificaAbonati("S-a programat un meci nou de volei.");
    }
}
