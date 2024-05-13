package E_Sportiv.exercitiu14.implementare;

public abstract class TemplateOcupareLoc {
    public void ocupareLoc(){
        aseazaLaCoada();
        prezintaBilet();
        controlCorporal();
        intraInStadion();
        ocupaLocul();
    }

    protected abstract void aseazaLaCoada();
    protected abstract void prezintaBilet();
    protected abstract void controlCorporal();
    protected abstract void intraInStadion();
    protected abstract void ocupaLocul();
}
