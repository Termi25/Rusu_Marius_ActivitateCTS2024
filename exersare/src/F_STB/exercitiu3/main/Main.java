package F_STB.exercitiu3.main;

import F_STB.exercitiu3.implementare.AbstractBuilder;
import F_STB.exercitiu3.implementare.AutobuzLinie;

public class Main {
    public static void main(String[] args) {
        AbstractBuilder builderAutobuz=new AutobuzLinie.AutobuzLinieBuilder(
                "Mercedes Benz","Popescu");
        AutobuzLinie autobuz=builderAutobuz.setIsAreDeschidereUsiFaraPasageri().build();
        System.out.println(autobuz);
    }
}
