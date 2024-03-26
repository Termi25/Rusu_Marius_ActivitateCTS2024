package F_STB.exercitiu2.implementare;

public abstract class MijlocTransport {
    private int numarTransport;
    private int kilometraj;

    protected MijlocTransport(int numarTransport, int kilometraj) {
        this.numarTransport = numarTransport;
        this.kilometraj = kilometraj;
    }

    protected MijlocTransport(){}

    public abstract MijlocTransport cloneaza();

    public int getNumarTransport() {
        return numarTransport;
    }

    public void setNumarTransport(int numarTransport) {
        this.numarTransport = numarTransport;
    }

    public int getKilometraj() {
        return kilometraj;
    }

    public void setKilometraj(int kilometraj) {
        this.kilometraj = kilometraj;
    }
}
