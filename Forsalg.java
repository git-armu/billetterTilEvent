public class Forsalg implements Billet {
    private int id;
    private int dageTilEvent;

    public Forsalg(int id, int dageTilEvent) {
        this.id = id;
        this.dageTilEvent = dageTilEvent;
    }

    public double pris() {
        if (dageTilEvent >= 10) {
            return 120 * 0.85;
        } else {
            return 120;
        }
    }

    public String toString() {
        return "Forsalg billet - ID: " + id + " - Pris: " + pris() + " kr";
    }
}
