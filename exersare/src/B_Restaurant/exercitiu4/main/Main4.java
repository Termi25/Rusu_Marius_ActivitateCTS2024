package B_Restaurant.exercitiu4.main;

import B_Restaurant.exercitiu4.implementare.AbstractClient;
import B_Restaurant.exercitiu4.implementare.Client;

public class Main4 {
    public static void main(String[] args) {
        try{
            AbstractClient client=new Client("Henry",
                    "1234567890111");
            AbstractClient client2=client.cloneaza();
            client2.setNumeClient("George");
            System.out.println(client);
            System.out.println(client2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
