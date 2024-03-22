package B_restaurant.exercitiu2.implementare;

public class Rezervare {
    private final String numeRezervare;
    private final String numarTelefon;
    private final boolean isNextToWindow;
    private final boolean hasErgonomicChairs;
    private final boolean isTableDecorated;
    private final boolean hasCustomMusic;

    protected Rezervare(String numeRezervare, String numarTelefon, boolean isNextToWindow,
                     boolean hasErgonomicChairs, boolean isTableDecorated,
                     boolean hasCustomMusic) {
        this.numeRezervare = numeRezervare;
        this.numarTelefon = numarTelefon;
        this.isNextToWindow = isNextToWindow;
        this.hasErgonomicChairs = hasErgonomicChairs;
        this.isTableDecorated = isTableDecorated;
        this.hasCustomMusic = hasCustomMusic;
    }

    public String getNumeRezervare() {
        return numeRezervare;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public boolean isNextToWindow() {
        return isNextToWindow;
    }

    public boolean isHasErgonomicChairs() {
        return hasErgonomicChairs;
    }

    public boolean isTableDecorated() {
        return isTableDecorated;
    }

    public boolean isHasCustomMusic() {
        return hasCustomMusic;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeRezervare='").append(numeRezervare).append('\'');
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append(", isNextToWindow=").append(isNextToWindow);
        sb.append(", hasErgonomicChairs=").append(hasErgonomicChairs);
        sb.append(", isTableDecorated=").append(isTableDecorated);
        sb.append(", hasCustomMusic=").append(hasCustomMusic);
        sb.append('}');
        return sb.toString();
    }

    public static class BuilderRezervare implements Builder{
        private String numeRezervare;
        private String numarTelefon;
        private boolean isNextToWindow=false;
        private boolean hasErgonomicChairs=false;
        private boolean isTableDecorated=false;
        private boolean hasCustomMusic=false;

        public BuilderRezervare(String numeRezervare, String numarTelefon) {
            this.numeRezervare = numeRezervare;
            this.numarTelefon = numarTelefon;
        }

        @Override
        public Builder setIsNextToWindow() {
            this.isNextToWindow=true;
            return this;
        }

        @Override
        public Builder setHasErgonomicChairs() {
            this.hasErgonomicChairs=true;
            return this;
        }

        @Override
        public Builder setIsTableDecorated() {
            this.isTableDecorated=true;
            return this;
        }

        @Override
        public Builder setHasCustomMusic() {
            this.hasCustomMusic=true;
            return this;
        }

        @Override
        public Rezervare creareRezervare() {
            return new Rezervare(numeRezervare,numarTelefon,isNextToWindow,
                    hasErgonomicChairs,isTableDecorated,hasCustomMusic);
        }
    }
}
