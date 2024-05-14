package F_STB.exercitiu8.implementare;

public class AutobuzProxy implements AutobuzAbstract {
    private AutobuzAbstract autobuz;

    public AutobuzProxy(AutobuzAbstract autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie() {
        if(this.autobuz.getNrPasageri()>0){
            this.autobuz.opresteInStatie();
        }else{
            System.out.println("Autobuzul nu opreste in statie.");
        }
    }

    @Override
    public int getNrPasageri() {
        return this.autobuz.getNrPasageri();
    }
}
