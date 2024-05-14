package E_Sportiv.exercitiu8.implementare;

public class VanzareBiletProxy implements VanzareBiletAbstract{
    private VanzareBiletAbstract bilet;

    public VanzareBiletProxy(VanzareBiletAbstract bilet) {
        this.bilet = bilet;
    }

    @Override
    public void cumparareBilet() {
        if(this.bilet.getVarsta()>=14){
            this.bilet.cumparareBilet();
        }else{
            System.out.println("Biletul nu poate fi cumparat de un minor.");
        }
    }

    @Override
    public int getVarsta() {
        return this.bilet.getVarsta();
    }
}
