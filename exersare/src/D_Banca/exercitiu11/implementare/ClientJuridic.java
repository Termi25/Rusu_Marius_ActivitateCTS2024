package D_Banca.exercitiu11.implementare;

public class ClientJuridic implements TipClient {
    @Override
    public void solicataDocumente(String nume) {
        System.out.println("Persoana juridica "+nume+
                " necesita documentele: \n"+
                "-> actele de infiintare a firmei\n"+
                "-> dovada inregistrarii la Registrul comertului\n");
    }
}
