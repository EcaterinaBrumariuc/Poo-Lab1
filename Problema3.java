import java.util.Scanner; // Importăm clasa Scanner pentru citirea de la tastatură

public class Problema3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Citirea vârstelor
        System.out.print("Introduceți vârsta primului copil: ");
        int a = scanner.nextInt();

        System.out.print("Introduceți vârsta celui de-al doilea copil: ");
        int b = scanner.nextInt();

        // 2. Compararea vârstelor și calcularea diferenței
        if (a > b) {
            int diferenta = a - b;
            System.out.println("Primul copil este mai mare cu " + diferenta + " ani");
        } else if (b > a) {
            int diferenta = b - a;
            System.out.println("Al doilea copil este mai mare cu " + diferenta + " ani");
        } else {
            System.out.println("Copiii au varste egale");
        }

        scanner.close(); // Închidem scanner-ul
    }
}
