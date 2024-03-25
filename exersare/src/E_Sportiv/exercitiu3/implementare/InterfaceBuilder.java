package E_Sportiv.exercitiu3.implementare;

public interface InterfaceBuilder {
    public InterfaceBuilder setHasFoodIncluded();
    public InterfaceBuilder setHasErgonomicChair();
    public InterfaceBuilder setHasBeverage();
    public InterfaceBuilder setHasCustomSong();
    public InterfaceBuilder setHasMusicGenre();
    public Rezervare build();
}
