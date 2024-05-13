package E_Sportiv.exercitiu11.implementare;

public class SpectatorPeluza implements TipSpectator{
    @Override
    public void verificaSpectator(Spectator spectator) {
        System.out.println("Au fost verificate biletul si bagajul spectatorului "
                +spectator);
    }
}
