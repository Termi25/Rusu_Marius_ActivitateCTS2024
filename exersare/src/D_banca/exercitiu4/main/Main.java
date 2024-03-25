package D_banca.exercitiu4.main;

import D_banca.exercitiu4.implementare.ContBancar;
import D_banca.exercitiu4.implementare.PrototypeContBancar;

public class Main {
    public static void main(String[] args) {
        PrototypeContBancar contBancar1=new ContBancar("Henry","1234567890123","1234567890123456");
        PrototypeContBancar contBancar2=contBancar1.cloneaza();
        contBancar2.setNume("George");
        System.out.println(contBancar1);
        System.out.println(contBancar2);
    }
}
