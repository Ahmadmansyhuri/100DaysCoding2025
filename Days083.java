package isc100dayscooding;

import java.util.Scanner;

public class Days070 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan panjang : ");
        int panjang = input.nextInt();
        
        System.out.print("Masukkan lebar : ");
        int lebar = input.nextInt();
        
        for (int i = 0; i < lebar; i++) {  // Baris
            for (int j = 0; j < panjang; j++) {  // Kolom
                System.out.print("* ");
            }
            System.out.println();
        }
        
        input.close();
    }
}
