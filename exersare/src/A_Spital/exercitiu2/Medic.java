package A_Spital.exercitiu2;

public class Medic extends PersonalSpital{
    private int vechime;
    public Medic(String nume, int salariu) {
        super(nume, salariu);
        this.vechime=0;
    }
    public Medic(String nume,int salariu,int vechime){
        super(nume,salariu);
        this.vechime=vechime;
    }

    @Override
    public void afisare() {
        System.out.println("Medicul "+this.getNume()+" are salariul de "+this.getSalariu()+" si o vechime de "+this.vechime+" ani");
    }
}
