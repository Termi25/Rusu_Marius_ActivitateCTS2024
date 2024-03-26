package D_Banca.exercitiu3.implementare;

public class ContBancar {
    private final String numeClient;
    private final int codCont;
    private final boolean isContSalariu;
    private final boolean hasCardAtasat;
    private final boolean hasInternetBanking;

    protected ContBancar(String numeClient, int codCont, boolean isContSalariu,
                      boolean hasCardAtasat, boolean hasInternetBanking) {
        this.numeClient = numeClient;
        this.codCont = codCont;
        this.isContSalariu = isContSalariu;
        this.hasCardAtasat = hasCardAtasat;
        this.hasInternetBanking = hasInternetBanking;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public int getCodCont() {
        return codCont;
    }

    public boolean isContSalariu() {
        return isContSalariu;
    }

    public boolean isHasCardAtasat() {
        return hasCardAtasat;
    }

    public boolean isHasInternetBanking() {
        return hasInternetBanking;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContBancar{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", codCont=").append(codCont);
        sb.append(", isContSalariu=").append(isContSalariu);
        sb.append(", hasCardAtasat=").append(hasCardAtasat);
        sb.append(", hasInternetBanking=").append(hasInternetBanking);
        sb.append('}');
        return sb.toString();
    }

    public static class BuilderContBancar implements Builder {

        private String numeClient;
        private int codCont;
        private boolean isContSalariu=false;
        private boolean hasCardAtasat=false;
        private boolean hasInternetBanking=false;

        public BuilderContBancar(String numeClient, int codCont) {
            this.numeClient = numeClient;
            this.codCont = codCont;
        }

        @Override
        public Builder setIsContSalariu() {
            this.isContSalariu=true;
            return this;
        }

        @Override
        public Builder setIsHasCardAtasat() {
            this.hasCardAtasat=true;
            return this;
        }

        @Override
        public Builder setIsHasInternetBanking() {
            this.hasInternetBanking=true;
            return this;
        }

        @Override
        public ContBancar build() {
            return new ContBancar(numeClient,codCont,isContSalariu,
                    hasCardAtasat,hasInternetBanking);
        }
    }
}
