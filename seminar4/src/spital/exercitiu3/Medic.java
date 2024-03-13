package spital.exercitiu3;

import spital.exercitiu3.PersonalSpital;

public class Medic extends PersonalSpital {
    public Medic(String nume, int salariu) {
        super(nume, salariu);
    }
    @Override
    public void afisare() {
        System.out.println("Medicul "+this.getNume()+" are salariul de "+this.getSalariu());
    }
}
