package B_Restaurant.exercitiu10.implementare;

public class MasaRezervata {
    private int codMasa;

    public MasaRezervata(int codMasa) {
        this.codMasa = codMasa;
    }

    public int getCodMasa() {
        return codMasa;
    }

    @Override
    public String toString() {
        return String.valueOf(codMasa);
    }
}
