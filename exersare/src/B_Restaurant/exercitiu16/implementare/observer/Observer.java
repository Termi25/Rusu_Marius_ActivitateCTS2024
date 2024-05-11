package B_Restaurant.exercitiu16.implementare.observer;

public abstract class Observer {
    protected Observer tipNotificare;

    public void setSuccessor(Observer tipNotificare){
        this.tipNotificare=tipNotificare;
    }

    public abstract void notificaClient(String mesaj,String numeClient, String email, String numarTelefon);
}
