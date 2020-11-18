package damian.klubypilkarskie;

public class Main {
    public static void main(String[] args) {
        KlubPilkarski[] tabelaLigi = {new ManU(), new FCKurwyIPedaly(), new KlubPilkarski()};
        for (KlubPilkarski klubPilkarski : tabelaLigi) {
            System.out.println(klubPilkarski.robHajs());
        }
    }
}
