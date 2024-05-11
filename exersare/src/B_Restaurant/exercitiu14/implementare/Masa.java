package B_Restaurant.exercitiu14.implementare;

public class Masa extends OcupareMasaAbstracta{
    int codMasa;

    public Masa(int codMasa) {
        this.codMasa = codMasa;
    }

    @Override
    public void curataMasa() {
        System.out.println("S-a curatat masa "
                +codMasa+".");
    }

    @Override
    public void puneServetele() {
        System.out.println("S-au pus servetele pe masa "
                +codMasa+".");
    }

    @Override
    public void puneTacamuri() {
        System.out.println("S-au pus tacamuri pe masa "
                +codMasa+".");
    }

    @Override
    public void invitaClientiLaMasa() {
        System.out.println("Clientii sunt invitati sa ocupe masa "
                +codMasa+".");
    }
}
