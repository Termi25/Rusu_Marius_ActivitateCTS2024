package D_banca.exercitiu1.implementare;

public class FactoryCredite {
    public Credit creare(TipCredit tip,String nume, int suma,int durataLuni){
        switch (tip) {
            case NevoiePersonala -> {
                return new CreditNevoiePersonala(nume,suma,durataLuni);
            }
            case Ipotecar -> {
                return new CreditIpotecar(nume,suma,durataLuni);
            }
            default -> {
                return null;
            }
        }
    }
}
