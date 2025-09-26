import java.util.Scanner;

public class Main {

    // Funcție simplă care verifică dacă un număr este prim
    public static boolean verificarePrim(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Mesaj pentru utilizator
        System.out.print("Scrieți numărul de elemente n : ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Scrieți cele " + n + " numere naturale :");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // căutăm ultimul element prim
        for (int i = n - 1; i >= 0; i--) {
            if (verificarePrim(a[i])) {
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
