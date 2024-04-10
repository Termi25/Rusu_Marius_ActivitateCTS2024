package proxy.clase;

import java.util.ArrayList;
import java.util.List;

public class ProxyBiletSector implements BiletAbstract{
    private static List<Character> listaLitere=new ArrayList<>();
    private BiletAbstract bilet;

    public ProxyBiletSector(BiletAbstract bilet) {
        this.bilet = bilet;
    }

    public static void adaugaLitere(Character caracter){
        listaLitere.add(caracter);
    }

    @Override
    public void vanzareBilet(Client client) {
        if(listaLitere.contains(client.getNumeClient().charAt(0))){
            this.bilet.vanzareBilet(client);
        }else{
            System.out.println("Nu sunteti potrivit pentru acest sector.");
        }
    }
}
