public class ForsalgRabat implements Billet {
    private int id;
    private int dageTilEvent;
    public int studiekortId;

    public ForsalgRabat(int id, int dageTilEvent, int studiekortId) {
        this.id = id;
        this.dageTilEvent = dageTilEvent;
        this.studiekortId = studiekortId;
    }

    public double pris() {
        if (dageTilEvent >= 10) {
            return 90 * 0.95;
        } else {
            return 90;
        }
    }
    public String toString() {
        return "Forsalg med studierabat billet - ID: " + id + " - Pris: " + pris() + " - Studiekort ID: " + studiekortId;
    }
}
