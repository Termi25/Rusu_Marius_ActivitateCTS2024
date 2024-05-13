package F_STB.exercitiu15.implementare;

public class Autobuz {
    private int numarAutobuz;
    private StareAutobuz stareAutobuz;

    public Autobuz(int numarAutobuz) {
        this.numarAutobuz = numarAutobuz;
        this.stareAutobuz=new AutobuzLaCapatDeLinie();
    }

    protected void setStareAutobuz(StareAutobuz stareAutobuz) {
        this.stareAutobuz = stareAutobuz;
    }

    public void pleacaInCursa(){
        if(this.stareAutobuz instanceof AutobuzLaCapatDeLinie){
            StareAutobuz stare=new AutobuzInCursa();
            stare.schimbaStare(this);
            System.out.println("Autobuzul "+numarAutobuz+
                    " a plecat in cursa.");
        }else{
            System.out.println("Autobuzul "+numarAutobuz+
                    " nu poate pleca in cursa.");
        }
    }

    public void ajungeCapatLinie(){
        if(this.stareAutobuz instanceof AutobuzInCursa){
            StareAutobuz stare=new AutobuzLaCapatDeLinie();
            stare.schimbaStare(this);
            System.out.println("Autobuzul "+numarAutobuz+
                    " a ajuns la captul de linie.");
        }else{
            System.out.println("Autobuzul "+numarAutobuz+
                    " nu poate ajunge la capatul de linie.");
        }
    }

    public void reparaAutobuz(){
        if(this.stareAutobuz instanceof AutobuzLaCapatDeLinie){
            StareAutobuz stare=new AutobuzLaReparat();
            stare.schimbaStare(this);
            System.out.println("Autobuzul "+numarAutobuz+
                    " este la reparat.");
        }else{
            System.out.println("Autobuzul "+numarAutobuz+
                    " nu poate fi dus la reparat.");
        }
    }

    public void finalizeazaReparatieAutobuz(){
        if(this.stareAutobuz instanceof AutobuzLaReparat){
            StareAutobuz stare=new AutobuzLaCapatDeLinie();
            stare.schimbaStare(this);
            System.out.println("Autobuzul "+numarAutobuz+
                    " a fost reparat.");
        }else{
            System.out.println("Autobuzul "+numarAutobuz+
                    " nu este la reparat.");
        }
    }
}
