package E_Sportiv.exercitiu11.implementare;

public class SpectatorVIP implements TipSpectator{
    @Override
    public void verificaSpectator(Spectator spectator) {
        System.out.println("A fost verificat biletul spectatorului "
                +spectator);
    }
}
