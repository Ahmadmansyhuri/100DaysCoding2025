package isc100dayscooding;
import java.util.Scanner;

public class Days067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah kolom pola horizontal: ");
        int kolom = scanner.nextInt();

        for (int i = 0; i < kolom; i++) {
            System.out.print("* ");  
        }
        System.out.println(); 
        scanner.close();
    }
}
