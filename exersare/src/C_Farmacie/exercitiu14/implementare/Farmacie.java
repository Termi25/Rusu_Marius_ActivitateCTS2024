package C_Farmacie.exercitiu14.implementare;

import java.util.ArrayList;
import java.util.List;

public class Farmacie extends TemplateFarmacie{
    List<Integer> listaStocMedicamente;
    List<Integer> cerereMedicamente;

    public Farmacie() {
        this.listaStocMedicamente = new ArrayList<>();
        this.cerereMedicamente=new ArrayList<>();

        this.listaStocMedicamente.add(3);
        this.listaStocMedicamente.add(2);
        this.listaStocMedicamente.add(5);
    }

    @Override
    public void primesteReteta(List<Integer> listaMedicamente) {
        this.cerereMedicamente=listaMedicamente;
    }

    @Override
    public boolean verificaStoc() {
        if(this.cerereMedicamente.size()
                ==this.listaStocMedicamente.size()){
            for(int i = 0; i<this.listaStocMedicamente.size(); i++){
                if(this.listaStocMedicamente.get(i)<
                        this.cerereMedicamente.get(i)){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void incaseazaBanii() {
        System.out.println("S-au incasat banii.");
    }

    @Override
    public void actualizeazaStoc() {
        for(int i = 0; i<this.listaStocMedicamente.size(); i++){
            this.listaStocMedicamente.set(i,
                    this.listaStocMedicamente.get(i)
                            -this.cerereMedicamente.get(i));
        }
    }

    @Override
    public void emiteBon() {
        System.out.println("S-a emis bonul.");
    }
}
