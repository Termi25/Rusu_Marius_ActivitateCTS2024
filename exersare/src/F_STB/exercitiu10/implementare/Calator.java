package F_STB.exercitiu10.implementare;

public class Calator {
    String nume;
    MetodaPlata metodaPlata;

    public Calator(String nume) {
        this.nume = nume;
        this.metodaPlata=new CardCalatorii();
    }

    public void setMetodaPlata(MetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void platesteCalatorie(){
        this.metodaPlata.platesteCalatorie(this.nume);
    }
}
