package E_Sportiv.exercitiu13.implementare;

public class LocStadion {
    int rand;
    int loc;
    StareLoc stare;

    public LocStadion(int rand, int loc) {
        this.rand = rand;
        this.loc = loc;
        this.stare=new LocLiber();
    }

    protected void setStare(StareLoc stare) {
        this.stare = stare;
    }

    public void rezervareLoc(){
        if(this.stare instanceof LocLiber){
            StareLoc stare=new LocRezervare();
            stare.schimbaStare(this);
            System.out.println("Locul "+loc
                            +" de pe randul "
                    + rand+ " a fost rezervat.");
        }else{
            System.out.println("Locul "+loc
                    +" de pe randul "
                    + rand+ " nu poate fi ocupat.");
        }
    }

    public void ocupaLoc(){
        if(this.stare instanceof LocLiber ||
                this.stare instanceof LocRezervare){
            StareLoc stare=new LocOcupat();
            stare.schimbaStare(this);
            System.out.println("Locul "+loc
                    +" de pe randul "
                    + rand+ " a fost ocupat.");
        }else{
            System.out.println("Locul "+loc
                    +" de pe randul "
                    + rand+ " nu poate fi ocupat.");
        }
    }

    public void elibereazaLoc(){
        if(this.stare instanceof LocOcupat ||
                this.stare instanceof LocRezervare){
            StareLoc stare=new LocLiber();
            stare.schimbaStare(this);
            System.out.println("Locul "+loc
                    +" de pe randul "
                    + rand+ " a fost eliberat.");
        }else{
            System.out.println("Locul "+loc
                    +" de pe randul "
                    + rand+ " nu poate fi eliberat dublu.");
        }
    }
}
