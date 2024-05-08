package A_Spital.exercitiu10.main;

import A_Spital.exercitiu10.implementare.FlyweightFactory;
import A_Spital.exercitiu10.implementare.Salon;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory=new FlyweightFactory();
        Salon salon=new Salon(2,1,7);
        flyweightFactory.getPacient("Manole","0786557109","Strada Dorobanti 19").internareSpital(salon);
    }
}
