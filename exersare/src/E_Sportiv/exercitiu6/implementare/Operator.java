package E_Sportiv.exercitiu6.implementare;

public class Operator {
    String nume;

    public Operator(String nume) {
        this.nume = nume;
    }

    public void verificaBuletin(Persoana persoana){
        System.out.println("Operatorul "+nume+
                " a verificat buletinul lui "+
                persoana.getNume()+".");
    }

    public void verificaEsteCautataPersoana(Persoana persoana){
        if(persoana.isECautatDePolitie()){
            System.out.println("Operatorul "+nume+
                    " a verificat ca "+
                    persoana.getNume()+
                    " este cautat de politie.");
        }else{
            System.out.println("Operatorul "+nume+
                    " a verificat ca "+
                    persoana.getNume()+
                    " nu este cautat de politie.");
        }
    }

    public void verificaAAvutAntecedentePersoana(Persoana persoana){
        if(persoana.isAAvutAntecedente()){
            System.out.println("Operatorul "+nume+
                    " a verificat ca "+
                    persoana.getNume()+
                    " a avut antecedente.");
        }else{
            System.out.println("Operatorul "+nume+
                    " a verificat ca "+
                    persoana.getNume()+
                    " nu a avut antecedente.");
        }
    }
}
