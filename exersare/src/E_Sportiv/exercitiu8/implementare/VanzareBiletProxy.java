package E_Sportiv.exercitiu8.implementare;

public class VanzareBiletProxy extends VanzareBiletAbstract{
    public VanzareBiletProxy(String numeBilet, int rand, int loc, String ora, int varsta) {
        super(numeBilet, rand, loc, ora, varsta);
    }

    @Override
    public void cumparareBilet() {
        if(varsta>=14){
            System.out.println("Biletul a fost cumparat de "
                    +numeBilet);
        }else{
            System.out.println("Biletul nu poate fi cumparat de un minor.");
        }
    }
}
