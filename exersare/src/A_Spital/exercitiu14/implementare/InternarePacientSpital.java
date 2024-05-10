package A_Spital.exercitiu14.implementare;

public class InternarePacientSpital extends InternareAbstracta{
    @Override
    public boolean analizeazaPacient(String starePacient) {
        return starePacient.equals("grav");
    }

    @Override
    public boolean verificaDisponibilitatePat() {
        for(int i=0;i<listaPaturi.size();i++){
            if(listaPaturi.get(i)==0){
                listaPaturi.set(i,1);
                return true;
            }
        }
        return false;
    }

    @Override
    public void emiteFisaInternare(String numePacient) {
        System.out.println("Pacientul "+numePacient+" a fost admis.");
    }
}
