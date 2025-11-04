package isc100dayscooding;
import java.util.Scanner;

public class Days059 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = in.nextInt();
        System.out.println("-----------------------------------------");
        System.out.println("Angka ganjil dari " + N + " sampai 1:");
        for (int i = N; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.print(i + "\t");
            }
        }
        System.out.println("\n-----------------------------------------");
        System.out.println("Angka genap dari 1 sampai " + N + ":");
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();
        in.close();
    }
}
