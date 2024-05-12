package D_Banca.exercitiu10.implementare;

public class ClientBanca implements Flyweight{
    String nume;
    String adresa;
    String numarTelefon;
    String adresaMail;
    Banca banca;

    public ClientBanca(String nume, String adresa,
                       String numarTelefon,
                       String adresaMail, Banca banca) {
        this.nume = nume;
        this.adresa = adresa;
        this.numarTelefon = numarTelefon;
        this.adresaMail = adresaMail;
        this.banca = banca;
    }


    @Override
    public void creeazaContBancar(ContBancar cont) {
        System.out.println("Clientul "+nume
                +" a creat contul bancar "+cont);
    }
}
