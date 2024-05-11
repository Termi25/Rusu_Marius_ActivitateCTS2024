package B_Restaurant.exercitiu11.implementare;

public class Client {
    String nume;
    int masa;
    double sumaDePlata;
    MetodaPlata metodaPlata;

    public Client(int masa, String nume, double sumaDePlata) {
        this.masa = masa;
        this.nume = nume;
        this.sumaDePlata = sumaDePlata;
        this.metodaPlata=new PlataCard();
    }

    public MetodaPlata getMetodaPlata() {
        return metodaPlata;
    }

    public void setMetodaPlata(MetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void platesteNota(){
        this.metodaPlata.plateste(nume,masa,sumaDePlata);
    }
}
