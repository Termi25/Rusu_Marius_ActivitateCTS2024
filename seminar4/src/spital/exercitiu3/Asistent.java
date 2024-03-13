package spital.exercitiu3;

import spital.exercitiu3.PersonalSpital;

public class Asistent extends PersonalSpital {
    public Asistent(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisare() {
        System.out.println("Asistentul "+this.getNume()+" are salariul de "+this.getSalariu());
    }
}
