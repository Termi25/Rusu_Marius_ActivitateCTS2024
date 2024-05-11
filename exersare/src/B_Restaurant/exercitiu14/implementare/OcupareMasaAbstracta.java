package B_Restaurant.exercitiu14.implementare;

public abstract class OcupareMasaAbstracta {
    public void ocupareMasa(){
        curataMasa();
        puneServetele();
        puneTacamuri();
        invitaClientiLaMasa();
    }

    public abstract void curataMasa();
    public abstract void puneServetele();
    public abstract void puneTacamuri();
    public abstract void invitaClientiLaMasa();
}
