package F_STB.exercitiu11.implementare.observer;

public class Utilizator implements Observer{
    String nume;

    public Utilizator(String nume) {
        this.nume = nume;
    }

    @Override
    public void notificaUtilizator(String mesaj) {
        System.out.println("Utilizatorul "+nume+
                " a primit notificare: "+mesaj);
    }
}
