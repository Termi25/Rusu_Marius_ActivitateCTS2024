package A_Spital.exercitiu14.implementare;

import java.util.ArrayList;
import java.util.List;

public abstract class InternareAbstracta {

    List<Integer> listaPaturi;

    public InternareAbstracta() {
        this.listaPaturi=new ArrayList<>();
        this.listaPaturi.add(1);
        this.listaPaturi.add(0);
        this.listaPaturi.add(1);
    }

    public void interneazaPacient(String numePacient, String starePacient){
        if(analizeazaPacient(starePacient)){
            if(verificaDisponibilitatePat()){
                emiteFisaInternare(numePacient);
            }else{
                System.out.println("Nu exista pat disponibil.");
            }
        }else{
            System.out.println("Pacientul "+numePacient+" nu prezinta o stare grava. Acesta nu va fi internat.");
        }
    }

    protected abstract boolean analizeazaPacient(String starePacient);
    protected abstract boolean verificaDisponibilitatePat();
    protected abstract void emiteFisaInternare(String numePacient);
}
