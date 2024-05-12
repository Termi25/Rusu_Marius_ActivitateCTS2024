package E_Sportiv.exercitiu6.implementare;

public class Persoana {
    private String nume;
    private boolean eCautatDePolitie;
    private boolean aAvutAntecedente;

    public Persoana(String nume, boolean eCautatDePolitie,
                    boolean aAvutAntecedente) {
        this.nume = nume;
        this.eCautatDePolitie = eCautatDePolitie;
        this.aAvutAntecedente = aAvutAntecedente;
    }

    public String getNume() {
        return nume;
    }


    public boolean isECautatDePolitie() {
        return eCautatDePolitie;
    }

    public boolean isAAvutAntecedente() {
        return aAvutAntecedente;
    }
}
