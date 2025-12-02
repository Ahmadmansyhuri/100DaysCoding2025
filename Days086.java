package isc100dayscooding;
import java.util.Scanner;

public class Days086 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah elemen : ");
        int a = in.nextInt();
        int[] ar = new int[a];

        for (int i = 0; i < a; i++) {
            System.out.print("Masukkan elemen ke-" + i + " : ");
            ar[i] = in.nextInt();
        }

        int min = ar[0];
        for (int i = 0; i < a; i++) {
            if (ar[i] < min) {
                min = ar[i];
            }
        }
        System.out.println("\n==========================");
        System.out.println("Nilai minimal : " + min);
    }
}
