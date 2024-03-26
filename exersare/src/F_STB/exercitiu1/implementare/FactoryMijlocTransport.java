package F_STB.exercitiu1.implementare;

public class FactoryMijlocTransport {
    public MijlocTransport creeaza(TipTransport tip,int numarTransport,int kilometraj){
        switch (tip) {
            case Autobuz -> {
                return new Autobuz(numarTransport,kilometraj);
            }
            case Tramvai -> {
                return new Tramvai(numarTransport,kilometraj);
            }
            case Troleibuz -> {
                return new Troleibuz(numarTransport,kilometraj);
            }
            default ->{
                return null;
            }
        }
    }
}
