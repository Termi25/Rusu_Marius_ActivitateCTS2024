package spital.exercitiu3;

public class FactoryAsistent implements FactoryPersonalSpital {

    @Override
    public PersonalSpital crearePersonal(String nume, int salariu) {
        return new Asistent(nume,salariu);
    }
}