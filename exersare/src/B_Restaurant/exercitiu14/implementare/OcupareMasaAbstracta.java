package B_Restaurant.exercitiu14.implementare;

public abstract class OcupareMasaAbstracta {
    public void ocupareMasa(){
        curataMasa();
        puneServetele();
        puneTacamuri();
        invitaClientiLaMasa();
    }

    protected abstract void curataMasa();
    protected abstract void puneServetele();
    protected abstract void puneTacamuri();
    protected abstract void invitaClientiLaMasa();
}
