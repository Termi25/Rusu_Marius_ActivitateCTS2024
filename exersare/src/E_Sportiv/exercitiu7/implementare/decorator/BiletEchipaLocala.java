package E_Sportiv.exercitiu7.implementare.decorator;

public class BiletEchipaLocala extends Decorator{
    public BiletEchipaLocala(String numeBilet, int rand, int loc, String ora, boolean joacaEchipaLocala) {
        super(numeBilet, rand, loc, ora, joacaEchipaLocala);
    }

    @Override
    public void mesajSpecial() {
        System.out.println("Biletul pe numele de "+numeBilet
                +" a fost vandut.");
        if(joacaEchipaLocala){
            System.out.println("Hai echipa locala!");
        }
    }

    @Override
    public void vindeBilet() {
        mesajSpecial();
    }
}
