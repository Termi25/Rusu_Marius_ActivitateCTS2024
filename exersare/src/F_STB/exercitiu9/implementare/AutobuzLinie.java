package F_STB.exercitiu9.implementare;

public class AutobuzLinie {
    private int modelAutobuz;
    private int anFabricatie;
    private int numarLocuri;

    public AutobuzLinie(int modelAutobuz, int anFabricatie,
                        int numarLocuri) {
        this.modelAutobuz = modelAutobuz;
        this.anFabricatie = anFabricatie;
        this.numarLocuri = numarLocuri;
    }

    public int getModelAutobuz() {
        return modelAutobuz;
    }
}
