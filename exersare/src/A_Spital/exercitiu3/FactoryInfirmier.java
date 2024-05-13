package A_Spital.exercitiu3;

public class FactoryInfirmier implements FactoryPersonalSpital{
    @Override
    public PersonalSpital crearePersonal(String nume, int salariu) {
        return new Infirmier(nume,salariu);
    }
}
