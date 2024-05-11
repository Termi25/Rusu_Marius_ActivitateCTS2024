package C_Farmacie.exercitiu5.implementare.depozit;

public class StocDepozit extends StocDepozitAbstract{
    @Override
    public boolean verificaStocPentruMedicament(int index,int numarBucati) {
        return this.listaStocMedicamente.get(index)>=numarBucati;
    }
}
