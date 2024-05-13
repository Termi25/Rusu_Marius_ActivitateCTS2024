package F_STB.exercitiu8.implementare;

public class AutobuzProxy extends AutobuzAbstract{
    public AutobuzProxy(int numarAutobuz, int numarPasageri) {
        super(numarAutobuz, numarPasageri);
    }

    @Override
    public void opresteInStatie() {
        if(this.numarPasageri>0){
            System.out.println("Autobuzul opreste in statie.");
        }else{
            System.out.println("Autobuzul nu opreste in statie.");
        }
    }
}
