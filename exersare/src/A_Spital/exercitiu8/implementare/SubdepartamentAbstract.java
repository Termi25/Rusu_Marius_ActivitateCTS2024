package A_Spital.exercitiu8.implementare;

public abstract class SubdepartamentAbstract {
    String nume;

    public SubdepartamentAbstract(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SubdepartamentAbstract{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
