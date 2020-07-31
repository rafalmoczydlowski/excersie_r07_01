import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SitoEratostenesaHashSet {
    public static List<Integer> sitoEratostenesa (int n) {
        if (n < 2) {
            throw new IllegalArgumentException("Wartość nie może być mniejsza od 2!"); // wyjątek rzucany w sytuacji, gdy użytkownik wpiszę liczbę mniejszą od 2 (najmniejsza liczba pierwsza)
        }
        HashSet<Integer> liczbyPierwsze = new HashSet<>(n);
        for (int i = 2; i <= n && i >= 2; i++) {
            liczbyPierwsze.add(i); // do listy dodaje wszytkie wartości większe bądź równe 2 i mniejsze bądź równe n
        }
        for (int s = 2; s <= Math.sqrt((double) n); s++) { // ustanawia górną granicę działania pętli, gdy s do kwadratu będzie większe od n
            if(liczbyPierwsze.contains(s)) { // sprawdza czy wartość s znajduje się w liście
                for (int j = s * s; j <= n && j > 0; j += s) {
                    liczbyPierwsze.remove(j); // usuwa z listy wartośc j, czyli s do kwadratu, s*(s+1), s*(s+2), etc...
                }
            }
        }
        return new ArrayList<>(liczbyPierwsze);
    }
}
