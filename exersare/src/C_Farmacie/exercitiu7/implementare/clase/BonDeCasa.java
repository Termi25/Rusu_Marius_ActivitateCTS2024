package C_Farmacie.exercitiu7.implementare.clase;

public class BonDeCasa extends BonDeCasaAbstract{
    public BonDeCasa(int codBon, double sumaDePlata) {
        super(codBon, sumaDePlata);
    }

    @Override
    public void printeazaBon() {
        System.out.println("S-a achitat bonul cu codul "
                +codBon+" cu suma de plata "+sumaDePlata);
    }
}
