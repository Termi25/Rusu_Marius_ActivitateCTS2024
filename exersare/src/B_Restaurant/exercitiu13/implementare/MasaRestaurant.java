package B_Restaurant.exercitiu13.implementare;

public class MasaRestaurant {
    private int codMasa;
    private StareMasa stareMasa;

    public MasaRestaurant(int codMasa) {
        this.codMasa = codMasa;
        this.stareMasa=new MasaLibera();
    }

    public void setStareMasa(StareMasa stareMasa) {
        this.stareMasa = stareMasa;
    }

    public void rezervareMasa(){
        if(this.stareMasa instanceof MasaLibera){
            StareMasa stareRezervata=new MasaRezervata();
            stareRezervata.schimbaStare(this);
            System.out.println("Masa "+codMasa
                    +" a fost rezervata.");
        }else{
            System.out.println("Masa "+codMasa
                    +" nu este disponibila.");
        }
    }

    public void ocupareMasa(){
        if(this.stareMasa instanceof MasaRezervata){
            StareMasa stareOcupata=new MasaOcupata();
            stareOcupata.schimbaStare(this);
            System.out.println("Masa "+codMasa
                    +" a fost ocupata.");
        }else{
            System.out.println("Masa "+codMasa
                    +" nu este disponibila.");
        }
    }

    public void eliberareMasa(){
        if(this.stareMasa instanceof MasaOcupata){
            StareMasa stareEliberata=new MasaLibera();
            stareEliberata.schimbaStare(this);
            System.out.println("Masa "+codMasa
                    +" a fost eliberata.");
        }else{
            System.out.println("Masa "+codMasa
                    +" nu este disponibila.");
        }
    }
}
