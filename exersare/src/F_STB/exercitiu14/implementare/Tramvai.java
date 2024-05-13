package F_STB.exercitiu14.implementare;

public class Tramvai extends TemplateTramvai{
    int numarTramvai;

    public Tramvai(int numarTramvai) {
        this.numarTramvai = numarTramvai;
    }


    @Override
    protected void opresteInStatia1() {
        System.out.println("Tramvaiul "+numarTramvai+
                " a oprit in Statia1.");
    }

    @Override
    protected void opresteInStatia2() {
        System.out.println("Tramvaiul "+numarTramvai+
                " a oprit in Statia2.");
    }

    @Override
    protected void opresteInStatia3() {
        System.out.println("Tramvaiul "+numarTramvai+
                " a oprit in Statia3.");
    }

    @Override
    protected void opresteInStatia4() {
        System.out.println("Tramvaiul "+numarTramvai+
                " a oprit in Statia4.");
    }

    @Override
    protected void opresteInStatia5() {
        System.out.println("Tramvaiul "+numarTramvai+
                " a oprit in Statia5.");
    }

    @Override
    protected void opresteInStatia6() {
        System.out.println("Tramvaiul "+numarTramvai+
                " a oprit in Statia6.");
    }
}
