package F_STB.exercitiu3.implementare;

public interface AbstractBuilder {

    public AbstractBuilder setIsAreOprireLaCapatLinie();

    public AbstractBuilder setIsAreDeschidereUsiFaraPasageri();

    public AutobuzLinie build();
}
