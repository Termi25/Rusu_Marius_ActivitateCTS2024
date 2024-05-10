package B_Restaurant.exercitiu6.implementare;

public class FacadeReceptionist {
    Receptionist receptionist;

    public FacadeReceptionist(Receptionist receptionist) {
        this.receptionist = receptionist;
    }

    public void verificaTot(){
        if(this.receptionist.verificaDisponibilitateMasa()){
            this.receptionist.verificaDebarasareMasa();
            this.receptionist.verificaServeteleMasa();
        }else{
            System.out.println("Nu este nicio masa disponibila.");
        }
    }
}
