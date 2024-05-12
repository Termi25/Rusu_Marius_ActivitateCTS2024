package D_Banca.exercitiu11.main;


import D_Banca.exercitiu11.implementare.Client;
import D_Banca.exercitiu11.implementare.ClientJuridic;

public class Main {
    public static void main(String[] args) {
        Client client=new Client("Manole");
        client.inregistrareLaBanca();

        client.setTipClient(new ClientJuridic());
        client.inregistrareLaBanca();
    }
}
