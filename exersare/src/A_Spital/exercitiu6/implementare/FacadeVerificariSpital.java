package A_Spital.exercitiu6.implementare;

public class FacadeVerificariSpital {
    private Pacient pacient;
    private Medic medic;
    private Salon salon;

    public FacadeVerificariSpital(Pacient pacient, Medic medic, Salon salon) {
        this.pacient = pacient;
        this.medic = medic;
        this.salon = salon;
    }

    public void verificaInternarePacient(){
        if(this.pacient.verificaStarePacient()){
            if(this.medic.cornfirmaInternarePacient(this.pacient)){
                if(this.salon.verificaDisponibilitatePat()){
                    System.out.println(this.pacient.getNumePacient()+" este internat intr-un pat dedicat.");
                }else{
                    System.out.println(this.pacient.getNumePacient()+" este internat, dar nu este niciun pat disponibil.");
                }
            }else{
                System.out.println(this.pacient.getNumePacient()+" a fost confirmat de medicul "+this.medic.getNumeMedic()+" sa nu fie in stare grava.");
            }
        }else{
            System.out.println(this.pacient+" nu se afla in stare grava");
        }
    }
}
