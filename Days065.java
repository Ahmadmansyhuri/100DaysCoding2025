package isc100dayscooding;
import java.util.Scanner;

public class Days065 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka untuk menghitung faktorial: ");
        int angka = in.nextInt();
        long hasil = faktorial(angka);
        System.out.println("Faktorial dari " + angka + " adalah " + hasil);
        in.close();
    }
    public static long faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long hasil = 1;
        for (int i = 2; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }
}
