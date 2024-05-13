package E_Sportiv.exercitiu11.implementare;

public class SpectatorTribuna implements TipSpectator{
    @Override
    public void verificaSpectator(Spectator spectator) {
        System.out.println("A fost verificat bagajul spectatorului "
                +spectator);
    }
}
