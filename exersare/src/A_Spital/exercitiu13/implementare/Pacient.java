package A_Spital.exercitiu13.implementare;

public class Pacient {
    private int numarPacient;
    private String numePacient;
    private StarePacient stare;

    public Pacient(int numarPacient, String numePacient) {
        this.numarPacient = numarPacient;
        this.numePacient = numePacient;
        this.stare=new StarePacientInternat();
    }

    protected void setStare(StarePacient stare) {
        this.stare = stare;
    }

    public void verificareStarePacient(String status){
        if(status.equals("grav") && this.stare instanceof StarePacientInternat){
            StarePacient stareNoua=new StarePacientSubObservatie();
            stareNoua.schimbareStare(this);
            System.out.println("Pacientul "+numePacient+" a fost trecut sub observatie.");
        }
    }

    public void vindecarePacient(){
        if(this.stare instanceof StarePacientSubObservatie){
            StarePacient stareNoua=new StarePacientExternat();
            stareNoua.schimbareStare(this);
            System.out.println("Pacientul "+numePacient+" a fost externat.");
        }else{
            System.out.println("Pacientul "+numePacient+" nu a fost verificat.");
        }
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "numarPacient=" + numarPacient +
                ", numePacient='" + numePacient + '\'' +
                ", stare=" + stare +
                '}';
    }
}
