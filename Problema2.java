import java.util.Scanner;

public class PerechiSuma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Citim numarul n de la tastatura
        System.out.print("Introduceti numarul n: ");
        int n = sc.nextInt();

        // Parcurgem toate valorile posibile pentru x
        // x trebuie sa fie pozitiv si x <= y, deci x merge de la 1 pana la n/2
        for (int x = 1; x <= n / 2; x++) {
            int y = n - x; // calculam y astfel incat x + y = n
            System.out.println(x + " " + y); // afisam perechea
        }

        sc.close();
    }
}
