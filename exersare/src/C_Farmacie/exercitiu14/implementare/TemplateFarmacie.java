package C_Farmacie.exercitiu14.implementare;

import java.util.List;

public abstract class TemplateFarmacie {
    public void cumparaReteta(List<Integer> listaMedicamente){
        primesteReteta(listaMedicamente);
        if(verificaStoc()){
            incaseazaBanii();
            actualizeazaStoc();
            emiteBon();
        }else{
            System.out.println("Nu exista stoc suficient.");
        }
    }

    protected abstract void primesteReteta(List<Integer> listaMedicamente);
    protected abstract boolean verificaStoc();
    protected abstract void incaseazaBanii();
    protected abstract void actualizeazaStoc();
    protected abstract void emiteBon();
}
