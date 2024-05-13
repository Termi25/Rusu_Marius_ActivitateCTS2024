package F_STB.exercitiu8.main;

import F_STB.exercitiu8.implementare.AutobuzAbstract;
import F_STB.exercitiu8.implementare.AutobuzProxy;

public class Main {
    public static void main(String[] args) {
        AutobuzAbstract autobuzAbstract=
                new AutobuzProxy(
                        123,
                        0);
        autobuzAbstract.opresteInStatie();
    }
}
