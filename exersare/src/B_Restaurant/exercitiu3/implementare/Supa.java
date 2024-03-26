package B_Restaurant.exercitiu3.implementare;

public abstract class Supa {
    private String denumire;
    private int cantitateGrame;

    public Supa(String denumire, int cantitateGrame) {
        this.denumire = denumire;
        this.cantitateGrame = cantitateGrame;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getCantitateGrame() {
        return cantitateGrame;
    }

    public void setCantitateGrame(int cantitateGrame) {
        this.cantitateGrame = cantitateGrame;
    }
}
