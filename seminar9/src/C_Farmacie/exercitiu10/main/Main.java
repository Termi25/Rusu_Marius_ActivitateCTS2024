package C_Farmacie.exercitiu10.main;

import C_Farmacie.exercitiu10.clase.Flyweight;
import C_Farmacie.exercitiu10.clase.FlyweightFactory;
import C_Farmacie.exercitiu10.clase.Reteta;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory=new FlyweightFactory();
        Reteta reteta1 = new Reteta("Reteta1",20.0,1);
        Reteta reteta2 = new Reteta("Reteta2",40.0,2);
        Reteta reteta3 = new Reteta("Reteta3",16.0,1);
        Reteta reteta4 = new Reteta("Reteta4",100.0,5);

        factory.getClient("Gigel","1234567").achizitionareReteta(reteta2);
        factory.getClient("Gigel","1234567").achizitionareReteta(reteta4);

        factory.getClient("Ionel","7654321").achizitionareReteta(reteta1);
        factory.getClient("Ionel","7654321").achizitionareReteta(reteta3);
        factory.getClient("Ionel","7654321").achizitionareReteta(reteta1);
        factory.getClient("Ionel","7654321").achizitionareReteta(reteta3);
        factory.getClient("Ionel","7654321").achizitionareReteta(reteta1);
        factory.getClient("Ionel","7654321").achizitionareReteta(reteta3);
        factory.getClient("Ionel","7654321").achizitionareReteta(reteta1);
    }
}
