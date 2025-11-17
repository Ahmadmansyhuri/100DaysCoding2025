package isc100dayscooding;
import java.util.Scanner;

public class Days071 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris segitiga: ");
        int baris = in.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        in.close();
    }
}
