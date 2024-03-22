package C_farmacie.exercitiu3.implementare;

public interface Builder {
    public Builder setNumarPungi(int numarPungi);
    public Builder setPlataCuCard();
    public Builder setCardFidelitate();
    public Builder setCotaTVA();
    public Factura build();
}
