package F_STB.exercitiu14.implementare;

public abstract class TemplateTramvai {
    public void parcurgereTraseuDus(){
        System.out.println("START------------------");
        opresteInStatia1();
        opresteInStatia2();
        opresteInStatia3();
        opresteInStatia4();
        opresteInStatia5();
        opresteInStatia6();
        System.out.println("STOP------------------");
        System.out.println();
    }

    public void parcurgereTraseuIntors(){
        System.out.println("START------------------");
        opresteInStatia6();
        opresteInStatia5();
        opresteInStatia4();
        opresteInStatia3();
        opresteInStatia2();
        opresteInStatia1();
        System.out.println("STOP------------------");
        System.out.println();
    }

    protected abstract void opresteInStatia1();
    protected abstract void opresteInStatia2();
    protected abstract void opresteInStatia3();
    protected abstract void opresteInStatia4();
    protected abstract void opresteInStatia5();
    protected abstract void opresteInStatia6();
}
