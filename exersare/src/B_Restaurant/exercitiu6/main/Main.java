package B_Restaurant.exercitiu6.main;

import B_Restaurant.exercitiu6.implementare.FacadeReceptionist;
import B_Restaurant.exercitiu6.implementare.Receptionist;

public class Main {
    public static void main(String[] args) {
        Receptionist receptionist = new Receptionist();
        FacadeReceptionist facade=new FacadeReceptionist(receptionist);
        facade.verificaTot();
    }
}
