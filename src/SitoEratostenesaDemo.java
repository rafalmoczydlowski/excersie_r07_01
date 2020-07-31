import java.util.Scanner;

public class SitoEratostenesaDemo {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę n większą od 2. Program wyświetli liczby pierwsze z przedziału od 2 do n...");
        int liczba = sc.nextInt();
        var liczbyPierwsze = SitoEratostenesaHashSet.sitoEratostenesa(liczba);
        System.out.println(liczbyPierwsze);
    }
}
