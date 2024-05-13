package E_Sportiv.exercitiu14.implementare;

public class LocStadion extends TemplateOcupareLoc{
    @Override
    public void aseazaLaCoada() {
        System.out.println("Clientul se aseaza la coada.");
    }

    @Override
    public void prezintaBilet() {
        System.out.println("Clientul prezinta biletul.");
    }

    @Override
    public void controlCorporal() {
        System.out.println("Clientul este controlat corporal.");
    }

    @Override
    public void intraInStadion() {
        System.out.println("Clientul intra in stadion.");
    }

    @Override
    public void ocupaLocul() {
        System.out.println("Clientul ocupa locul.");
    }
}
