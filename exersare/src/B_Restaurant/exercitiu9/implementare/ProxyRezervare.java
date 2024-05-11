package B_Restaurant.exercitiu9.implementare;

public class ProxyRezervare implements RezervareAbstracta{
    int numarPersoane;
    String numeRezervare;
    String oraRezervare;
    String dataRezervare;

    public ProxyRezervare(int numarPersoane, String numeRezervare, String dataRezervare, String oraRezervare) {
        this.dataRezervare = dataRezervare;
        this.numarPersoane = numarPersoane;
        this.numeRezervare = numeRezervare;
        this.oraRezervare = oraRezervare;
    }
    @Override
    public void realizareRezervare() {
        if(numarPersoane>=4){
            System.out.println("Rezervare in numele "
                    +numeRezervare+" pentru "+numarPersoane
                    +" persoane "+ " a fost facuta pentru ora "
                    +oraRezervare+ " in data de "+dataRezervare);
        }else{
            System.out.println("Rezervarea nu a fost realizata. Exista suficiente locuri pentru mesele de doua persoane.");
        }
    }
}
