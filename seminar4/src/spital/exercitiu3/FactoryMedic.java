package spital.exercitiu3;

public class FactoryMedic implements FactoryPersonalSpital{
    @Override
    public PersonalSpital crearePersonal(String nume, int salariu) {
        return new Medic(nume,salariu);
    }
}
