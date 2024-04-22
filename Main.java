public class Main {
    public static void main(String[] args) {
        SolgteBilletter solgteBilletter = new SolgteBilletter();

        Billet dørsalgBillet = new Dørsalg(1);
        Billet forsalgBillet = new Forsalg(2, 5);
        Billet forsalgRabatBillet = new ForsalgRabat(3, 8, 28);
        Billet forsalgRabatBillet2 = new ForsalgRabat(3, 8, 2);
        Billet forsalgRabatBillet3 = new ForsalgRabat(3, 8, 190);

        solgteBilletter.tilføjBillet(dørsalgBillet);
        solgteBilletter.tilføjBillet(forsalgBillet);
        solgteBilletter.tilføjBillet(forsalgRabatBillet);
        solgteBilletter.tilføjBillet(forsalgRabatBillet2);
        solgteBilletter.tilføjBillet(forsalgRabatBillet3);

        System.out.println("Solgte billetter:");
        System.out.println(solgteBilletter);

        solgteBilletter.antalBilletter();

        System.out.println("Studiekort ID'er:");
        System.out.println(solgteBilletter.hentStudiekort());
    }
}
