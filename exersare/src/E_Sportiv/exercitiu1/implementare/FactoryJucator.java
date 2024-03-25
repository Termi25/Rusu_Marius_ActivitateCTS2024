package E_Sportiv.exercitiu1.implementare;

public class FactoryJucator {
    public Jucator creare(TipJucator tip,String nume,int varsta){
        switch (tip) {
            case Portar -> {
                return new Portar(nume,varsta);
            }
            case Fundas -> {
                return new Fundas(nume,varsta);
            }
            case Atacant -> {
                return new Atacant(nume,varsta);
            }
            default->{
                return null;
            }
        }
    }
}
