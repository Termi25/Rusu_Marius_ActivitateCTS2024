package C_Farmacie.exercitiu6.implementare;

public class Farmacist {
    String nume;

    public Farmacist(String nume) {
        this.nume = nume;
    }

    public void verificaRetetaClient(){
        System.out.println("S-a verificat reteta clientului.");
    }

    public void verificaMedicamenteSolicitate(){
        System.out.println("S-au verificat disponibilitatea medicamentelor solicitate.");
    }

    public void verificaCardSanatate(){
        System.out.println("S-a verificat cardul de sanatate.");
    }
}
