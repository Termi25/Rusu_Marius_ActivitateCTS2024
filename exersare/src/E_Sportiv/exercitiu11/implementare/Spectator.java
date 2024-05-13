package E_Sportiv.exercitiu11.implementare;

public class Spectator {
    String nume;
    TipSpectator tip;

    public Spectator(String nume) {
        this.nume = nume;
        this.tip=new SpectatorPeluza();
    }

    public void setTip(TipSpectator tip) {
        this.tip = tip;
    }

    public void verificareSpectator(){
        this.tip.verificaSpectator(this);
    }

    @Override
    public String toString() {
        return nume;
    }
}
