package C_farmacie.exercitiu4.implementare;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements PrototypeReteta{
    private String numeReteta;
    private Double gramaj;
    private Map<String,Double> cantitatiReteta;

    public Reteta(String numeReteta,Double gramaj, Map<String, Double> cantitatiReteta) {
        this.numeReteta = numeReteta;
        this.gramaj=gramaj;
        this.cantitatiReteta = cantitatiReteta;
        Double verificareGramaj=0.0;
        for(String elementReteta: cantitatiReteta.keySet()){
            verificareGramaj+=cantitatiReteta.get(elementReteta);
        }
        if(verificareGramaj<gramaj-0.1
                && verificareGramaj>gramaj+0.1){
            throw new RuntimeException("Gramaj incorect");
        }
    }

    private Reteta(){

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Reteta{");
        sb.append("numeReteta='").append(numeReteta).append('\'');
        sb.append(", gramaj=").append(gramaj);
        sb.append(", cantitatiReteta=").append(cantitatiReteta);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public PrototypeReteta cloneaza() {
        Reteta copieReteta=new Reteta();
        copieReteta.gramaj=this.gramaj;
        copieReteta.numeReteta=this.numeReteta;
        copieReteta.cantitatiReteta=new HashMap<>();
        for(String elementReteta:this.cantitatiReteta.keySet()){
            copieReteta.cantitatiReteta.put(elementReteta,
                    this.cantitatiReteta.get(elementReteta));
        }
        return copieReteta;
    }

    @Override
    public void setNumeReteta(String nume) {
        this.numeReteta=nume;
    }
}
