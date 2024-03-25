package E_Sportiv.exercitiu3.implementare;

public class Rezervare {
    private final String numeClient;
    private final boolean hasFoodIncluded;
    private final boolean hasErgonomicChair;
    private final boolean hasBeverage;
    private final boolean hasCustomSong;
    private final boolean hasMusicGenre;

    protected Rezervare(String numeClient, boolean hasFoodIncluded,
                     boolean hasErgonomicChair, boolean hasBeverage,
                     boolean hasCustomSong, boolean hasMusicGenre) {
        this.numeClient = numeClient;
        this.hasFoodIncluded = hasFoodIncluded;
        this.hasErgonomicChair = hasErgonomicChair;
        this.hasBeverage = hasBeverage;
        this.hasCustomSong = hasCustomSong;
        this.hasMusicGenre = hasMusicGenre;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", hasFoodIncluded=").append(hasFoodIncluded);
        sb.append(", hasErgonomicChair=").append(hasErgonomicChair);
        sb.append(", hasBeverage=").append(hasBeverage);
        sb.append(", hasCustomSong=").append(hasCustomSong);
        sb.append(", hasMusicGenre=").append(hasMusicGenre);
        sb.append('}');
        return sb.toString();
    }

    public static class RezervareBuilder implements InterfaceBuilder{
        private String numeClient;
        private boolean hasFoodIncluded=false;
        private boolean hasErgonomicChair=false;
        private boolean hasBeverage=false;
        private boolean hasCustomSong=false;
        private boolean hasMusicGenre=false;

        public RezervareBuilder(String numeClient) {
            this.numeClient = numeClient;
        }

        @Override
        public InterfaceBuilder setHasFoodIncluded() {
            this.hasFoodIncluded=true;
            return this;
        }

        @Override
        public InterfaceBuilder setHasErgonomicChair() {
            this.hasErgonomicChair=true;
            return this;
        }

        @Override
        public InterfaceBuilder setHasBeverage() {
            this.hasBeverage=true;
            return this;
        }

        @Override
        public InterfaceBuilder setHasCustomSong() {
            this.hasCustomSong=true;
            return this;
        }

        @Override
        public InterfaceBuilder setHasMusicGenre() {
            this.hasMusicGenre=true;
            return this;
        }

        @Override
        public Rezervare build() {
            return new Rezervare(numeClient,hasFoodIncluded,hasErgonomicChair,
                    hasBeverage,hasCustomSong,hasMusicGenre);
        }
    }
}
