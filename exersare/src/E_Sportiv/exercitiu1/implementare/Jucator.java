package E_Sportiv.exercitiu1.implementare;

public abstract class Jucator {
    private String numeJucator;
    private int varstaJucator;

    protected Jucator(String numeJucator, int varstaJucator) {
        this.numeJucator = numeJucator;
        this.varstaJucator = varstaJucator;
    }

    public String getNumeJucator() {
        return numeJucator;
    }

    public void setNumeJucator(String numeJucator) {
        this.numeJucator = numeJucator;
    }

    public int getVarstaJucator() {
        return varstaJucator;
    }

    public void setVarstaJucator(int varstaJucator) {
        this.varstaJucator = varstaJucator;
    }
}
