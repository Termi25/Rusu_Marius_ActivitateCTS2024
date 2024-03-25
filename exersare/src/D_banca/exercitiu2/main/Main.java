package D_banca.exercitiu2.main;

import D_banca.exercitiu2.implementare.Client;
import D_banca.exercitiu2.implementare.FactoryClient;
import D_banca.exercitiu2.implementare.FactoryClientFizic;
import D_banca.exercitiu2.implementare.FactoryClientJuridic;

public class Main {
    public static void main(String[] args) {
        FactoryClient factoryFizic=new FactoryClientFizic();
        Client clientFizic= factoryFizic.creare("Henry",12000);
        System.out.println(clientFizic);

        FactoryClient factoryJuridic=new FactoryClientJuridic();
        Client clientJuridic=factoryJuridic.creare("Gheorghe",10000);
        System.out.println(clientJuridic);
    }
}
