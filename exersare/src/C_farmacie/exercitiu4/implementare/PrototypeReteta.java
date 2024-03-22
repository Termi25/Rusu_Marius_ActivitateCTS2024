package C_farmacie.exercitiu4.implementare;

import C_farmacie.exercitiu2.implementare.AbstractFactory;

public interface PrototypeReteta {
    public PrototypeReteta cloneaza();
    public void setNumeReteta(String nume);
}
