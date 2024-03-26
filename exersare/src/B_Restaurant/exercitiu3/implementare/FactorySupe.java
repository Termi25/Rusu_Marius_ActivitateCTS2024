package B_Restaurant.exercitiu3.implementare;

public class FactorySupe {
    public Supa creareSupa(TipuriSupe tipSupa, String denumire, int gramaj){
        switch (tipSupa){
            case SupaLegume -> {
                return new SupaLegume(denumire,gramaj);
            }
            case SupaCiuperci -> {
                return new SupaCiuperci(denumire,gramaj);
            }
            case SupaVita -> {
                return new SupaVita(denumire,gramaj);
            }
            default -> {
                return null;
            }
        }
    }
}
