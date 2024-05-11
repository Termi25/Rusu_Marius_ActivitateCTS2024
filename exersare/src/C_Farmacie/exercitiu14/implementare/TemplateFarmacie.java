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

    public abstract void primesteReteta(List<Integer> listaMedicamente);
    public abstract boolean verificaStoc();
    public abstract void incaseazaBanii();
    public abstract void actualizeazaStoc();
    public abstract void emiteBon();
}
