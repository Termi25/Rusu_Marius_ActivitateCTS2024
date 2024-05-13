package E_Sportiv.exercitiu10.implementare;

public class Persoana implements Flyweight{
    int codPersoana;
    int inaltime;
    int latime;
    int loc;
    int rand;
    String culoareTricou;

    public Persoana(int codPersoana, int inaltime, int latime,
                    int loc, int rand, String culoareTricou) {
        this.codPersoana = codPersoana;
        this.inaltime = inaltime;
        this.latime = latime;
        this.loc = loc;
        this.rand = rand;
        this.culoareTricou = culoareTricou;
    }

    @Override
    public void deseneazaPersoana(Tribuna tribuna) {
        System.out.println("Persoana "+codPersoana+
                " cu inaltime si latime: "+inaltime+
                ' '+latime+", culoare de tricou: "+
                culoareTricou+" a fost desenata pe locul si randul: "+
                loc+' '+rand+" in tribuna: "+tribuna);
    }
}
