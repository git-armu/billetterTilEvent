import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SolgteBilletter {
    private List<Billet> solgteBilletter;

    public SolgteBilletter() {
        solgteBilletter = new ArrayList<>();
    }

    public void tilføjBillet(Billet billet) {
        solgteBilletter.add(billet);
    }

    public String toString() {
        List<Billet> sortedBilletter = new ArrayList<>(solgteBilletter);
        sortedBilletter.sort(Comparator.comparing(billet -> Integer.parseInt(billet.toString().split("ID: ")[1].split(" - ")[0])));

        StringBuilder sb = new StringBuilder();
        for (Billet billet : sortedBilletter) {
            sb.append(billet.toString()).append("\n");
        }
        return sb.toString();
    }

    public void antalBilletter() {
        int antalDørsalg = 0;
        int antalForsalg = 0;
        int antalForsalgRabat = 0;

        for (Billet billet : solgteBilletter) {
            if (billet instanceof Dørsalg) {
                antalDørsalg++;
            } else if (billet instanceof Forsalg) {
                antalForsalg++;
            } else if (billet instanceof ForsalgRabat) {
                antalForsalgRabat++;
            }
        }
        System.out.println("Antal solgte Dørsalg billetter: " + antalDørsalg);
        System.out.println("Antal solgte Forsalg billetter: " + antalForsalg);
        System.out.println("Antal solgte Forsalg med studierabat billetter: " + antalForsalgRabat);
    }

    public List<Integer> hentStudiekort() {
        List<Integer> studiekortIdList = new ArrayList<>();
        for (Billet billet : solgteBilletter) {
            if (billet instanceof ForsalgRabat) {
                ForsalgRabat forsalgRabat = (ForsalgRabat) billet;
                studiekortIdList.add(forsalgRabat.studiekortId);
            }
        }
        Collections.sort(studiekortIdList);
        return studiekortIdList;
    }
}
