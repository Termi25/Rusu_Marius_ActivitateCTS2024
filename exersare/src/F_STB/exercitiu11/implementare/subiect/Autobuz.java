package F_STB.exercitiu11.implementare.subiect;

public class Autobuz extends Subiect{
    int numarAutobuz;

    public Autobuz(int numarAutobuz) {
        this.numarAutobuz = numarAutobuz;
    }

    @Override
    public void notificaPlecareCapatLinie() {
        notificaAbonati("Autobuzul "+numarAutobuz
                +" va pleca din statia de capat de linie.");
    }
}
