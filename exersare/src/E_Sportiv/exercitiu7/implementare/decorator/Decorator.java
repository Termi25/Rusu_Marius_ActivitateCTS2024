package E_Sportiv.exercitiu7.implementare.decorator;

import E_Sportiv.exercitiu7.implementare.clase.BiletAbstract;

public abstract class Decorator extends BiletAbstract {
    public Decorator(String numeBilet, int rand, int loc, String ora, boolean joacaEchipaLocala) {
        super(numeBilet, rand, loc, ora, joacaEchipaLocala);
    }

    public abstract void mesajSpecial();
}
