package D_Banca.exercitiu11.implementare;

public class ClientFizic implements TipClient {
    @Override
    public void solicataDocumente(String nume) {
        System.out.println("Persoana fizica "+nume+
                " necesita documentele: \n"+
                "-> buletin\n"+
                "-> adeverinta de munca\n");
    }
}
