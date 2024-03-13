package spital.exercitiu3;

import spital.exercitiu3.PersonalSpital;

public class FactoryBrancardier implements FactoryPersonalSpital{

    @Override
    public PersonalSpital crearePersonal(String nume, int salariu) {
        return new Brancardier(nume,salariu);
    }
}
