package E_Sportiv.exercitiu9.implementare;

public class Loc implements Componenta{
    int rand;
    int loc;

    public Loc(int rand, int loc) {
        this.rand = rand;
        this.loc = loc;
    }

    @Override
    public void adauga(Componenta componenta) {
        throw new RuntimeException();
    }

    @Override
    public void sterge(Componenta componenta) {
        throw new RuntimeException();
    }

    @Override
    public Componenta get(int index) {
        throw new RuntimeException();
    }

    @Override
    public void afisare(String indent) {
        System.out.println(indent+" Randul: "
                +rand+" Loc: "+loc);
    }
}
