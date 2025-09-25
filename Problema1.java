import java.util.Scanner;

public class Main {

    // Funcție care verifică dacă un număr este prim
    public static boolean isPrime(int x) {
        if (x < 2) return false;
        if (x == 2) return true;
        if (x % 2 == 0) return false;
        for (int d = 3; d * d <= x; d += 2) {
            if (x % d == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Mesaj pentru utilizator
        System.out.print("Scrieți numărul de elemente n (1 ≤ n ≤ 1000): ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Scrieți cele " + n + " numere naturale (mai mici decât 1.000.000):");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // căutăm ultimul element prim
        for (int i = n - 1; i >= 0; i--) {
            if (isPrime(a[i])) {
                a[i] = 0;
                break;
            }
        }

        // afișăm vectorul modificat
        System.out.println("Vectorul după înlocuirea ultimului număr prim cu 0 este:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
