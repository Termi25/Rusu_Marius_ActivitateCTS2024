package C_farmacie.exercitiu4.main;

import C_farmacie.exercitiu4.implementare.PrototypeReteta;
import C_farmacie.exercitiu4.implementare.Reteta;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Double> cantitati=new HashMap<>();
        cantitati.put("Vitamina C",12.0);
        cantitati.put("Vitamina D3",10.0);
        PrototypeReteta retetaOriginala=new Reteta("Reteta1",22.0,cantitati);
        PrototypeReteta copie=retetaOriginala.cloneaza();
        copie.setNumeReteta("Altceva");
        System.out.println(retetaOriginala);
        System.out.println(copie);
    }
}
