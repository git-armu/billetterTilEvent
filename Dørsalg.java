public class Dørsalg implements Billet {
    private int id;

    public Dørsalg(int id) {
        this.id = id;
    }
    public double pris() {
        return 150;
    }
    public String toString() {
        return "Dørsalg billet - ID: " + id + " - Pris: " + pris() + " kr";
    }
}
