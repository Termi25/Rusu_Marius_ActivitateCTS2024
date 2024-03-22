package C_farmacie.exercitiu3.implementare;

public class Factura {
    private final int numarFactura;
    private final Double sumaFactura;
    private final int numarPungi;
    private final boolean plataCuCard;
    private final boolean cardFidelitate;
    private final boolean cotaTVA;

    protected Factura(int numarFactura, Double sumaFactura,
                   int numarPungi, boolean plataCuCard,
                   boolean cardFidelitate, boolean cotaTVA) {
        this.numarFactura = numarFactura;
        this.sumaFactura = sumaFactura;
        this.numarPungi = numarPungi;
        this.plataCuCard = plataCuCard;
        this.cardFidelitate = cardFidelitate;
        this.cotaTVA = cotaTVA;
    }

    public int getNumarFactura() {
        return numarFactura;
    }

    public Double getSumaFactura() {
        return sumaFactura;
    }

    public int getNumarPungi() {
        return numarPungi;
    }

    public boolean isPlataCuCard() {
        return plataCuCard;
    }

    public boolean isCardFidelitate() {
        return cardFidelitate;
    }

    public boolean isCotaTVA() {
        return cotaTVA;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Factura{");
        sb.append("numarFactura=").append(numarFactura);
        sb.append(", sumaFactura=").append(sumaFactura);
        sb.append(", numarPungi=").append(numarPungi);
        sb.append(", plataCuCard=").append(plataCuCard);
        sb.append(", cardFidelitate=").append(cardFidelitate);
        sb.append(", cotaTVA=").append(cotaTVA);
        sb.append('}');
        return sb.toString();
    }

    public static class RetetaBuilder implements Builder{

        private int numarFactura;
        private Double sumaFactura;
        private int numarPungi=0;
        private boolean plataCuCard=false;
        private boolean cardFidelitate=false;
        private boolean cotaTVA=false;

        public RetetaBuilder(int numarFactura, Double sumaFactura) {
            this.numarFactura = numarFactura;
            this.sumaFactura = sumaFactura;
        }

        @Override
        public Builder setNumarPungi(int numarPungi) {
            this.numarPungi=numarPungi;
            return this;
        }

        @Override
        public Builder setPlataCuCard() {
            this.plataCuCard=true;
            return this;
        }

        @Override
        public Builder setCardFidelitate() {
            this.cardFidelitate=true;
            return this;
        }

        @Override
        public Builder setCotaTVA() {
            this.cotaTVA=true;
            return this;
        }

        @Override
        public Factura build() {
            return new Factura(numarFactura,
                    sumaFactura,
                    numarPungi,
                    plataCuCard,
                    cardFidelitate,
                    cotaTVA);
        }
    }
}
