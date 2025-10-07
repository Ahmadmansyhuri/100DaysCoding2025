package isc100dayscooding;
import java.util.Scanner;

public class Days030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan angka (a) : ");
        int a = scanner.nextInt();

        System.out.print("Masukkan angka (b) : ");
        int b = scanner.nextInt();

        // Menampilkan hasil perbandingan
        System.out.println("Apakah a >= b? " + (a >= b));
        System.out.println("Apakah a <= b? " + (a <= b));

        scanner.close();
    } 
}
