package F_STB.exercitiu15.implementare;

public class AutobuzLaReparat implements StareAutobuz{
    @Override
    public void schimbaStare(Autobuz autobuz) {
        autobuz.setStareAutobuz(this);
    }
}
