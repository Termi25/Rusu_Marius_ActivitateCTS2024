package B_Restaurant.exercitiu9.implementare;

public class ProxyRezervare implements RezervareAbstracta{
    private RezervareAbstracta rezervare;

    public ProxyRezervare(RezervareAbstracta rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizareRezervare() {
        if(this.rezervare.getNumarPersoane()>=4){
            this.rezervare.realizareRezervare();
        }else{
            System.out.println("Rezervarea nu a fost realizata. Exista suficiente locuri pentru mesele de doua persoane.");
        }
    }

    @Override
    public int getNumarPersoane() {
        return this.rezervare.getNumarPersoane();
    }
}
