package isc100dayscooding;
import java.util.Scanner;

public class Days063 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan angka N : ");
        int N = in.nextInt();
        
        long hasil = 1;
        for (int i = 1; i <= N; i++) {
            hasil *= i;
            System.out.println("Hasil perkalian dari 1 sampai " + i + " adalah: " + hasil);
        }
        System.out.println("Hasil perkalian dari 1 sampai " + N + " adalah: " + hasil);

    }
    
}
