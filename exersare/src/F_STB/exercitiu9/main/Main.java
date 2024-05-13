package F_STB.exercitiu9.main;

import F_STB.exercitiu9.implementare.AutobuzLinie;
import F_STB.exercitiu9.implementare.FlyweightFactory;

public class Main {
    public static void main(String[] args) {
        AutobuzLinie autobuzLinie=new AutobuzLinie(
                26,
                2002,
                40);
        FlyweightFactory factoryLinieAutobuz=
                new FlyweightFactory();

        factoryLinieAutobuz.get(
                123,
                "Gara de Nord",
                "Zizin")
                .inregistrareAutobuz(autobuzLinie);
    }
}
