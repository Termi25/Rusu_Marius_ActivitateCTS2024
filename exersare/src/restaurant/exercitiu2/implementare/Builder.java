package restaurant.exercitiu2.implementare;

public interface Builder {
    public abstract Builder setIsNextToWindow();
    public abstract Builder setHasErgonomicChairs();
    public abstract Builder setIsTableDecorated();
    public abstract Builder setHasCustomMusic();
    public abstract Rezervare creareRezervare();
}
