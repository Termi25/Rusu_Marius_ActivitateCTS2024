package E_Sportiv.exercitiu13.implementare;

public class LocRezervare implements StareLoc{
    @Override
    public void schimbaStare(LocStadion loc) {
        loc.setStare(this);
    }
}
