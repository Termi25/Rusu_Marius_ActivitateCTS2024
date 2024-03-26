package F_STB.exercitiu3.implementare;

public class AutobuzLinie {
    private final String modelAutobuz;
    private final String numeSofer;
    private final boolean areOprireLaCapatLinie;
    private final boolean areDeschidereUsiFaraPasageri;

    private AutobuzLinie(String modelAutobuz, String numeSofer,
                        boolean areOprireLaCapatLinie,
                        boolean areDeschidereUsiFaraPasageri) {
        this.modelAutobuz = modelAutobuz;
        this.numeSofer = numeSofer;
        this.areOprireLaCapatLinie = areOprireLaCapatLinie;
        this.areDeschidereUsiFaraPasageri = areDeschidereUsiFaraPasageri;
    }

    public String getModelAutobuz() {
        return modelAutobuz;
    }

    public String getNumeSofer() {
        return numeSofer;
    }

    public boolean isAreOprireLaCapatLinie() {
        return areOprireLaCapatLinie;
    }

    public boolean isAreDeschidereUsiFaraPasageri() {
        return areDeschidereUsiFaraPasageri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("modelAutobuz='").append(modelAutobuz).append('\'');
        sb.append(", numeSofer='").append(numeSofer).append('\'');
        sb.append(", areOprireLaCapatLinie=").append(areOprireLaCapatLinie);
        sb.append(", areDeschidereUsiFaraPasageri=").append(areDeschidereUsiFaraPasageri);
        sb.append('}');
        return sb.toString();
    }

    public static class AutobuzLinieBuilder implements AbstractBuilder{

        private String modelAutobuz;
        private String numeSofer;
        private boolean areOprireLaCapatLinie=false;
        private boolean areDeschidereUsiFaraPasageri=false;

        public AutobuzLinieBuilder(String modelAutobuz, String numeSofer) {
            this.modelAutobuz = modelAutobuz;
            this.numeSofer = numeSofer;
        }

        @Override
        public AbstractBuilder setIsAreOprireLaCapatLinie() {
            this.areOprireLaCapatLinie=true;
            return this;
        }

        @Override
        public AbstractBuilder setIsAreDeschidereUsiFaraPasageri() {
            this.areDeschidereUsiFaraPasageri=true;
            return this;
        }

        @Override
        public AutobuzLinie build() {
            return new AutobuzLinie(modelAutobuz,numeSofer,
                    areOprireLaCapatLinie,areDeschidereUsiFaraPasageri);
        }
    }
}
