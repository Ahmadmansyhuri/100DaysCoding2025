package isc100dayscooding;
import java.util.Scanner;

public class Days016 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.println("MASUKKAN ANGKA PERTAMA :");
        int A = in.nextInt();
        
        System.out.println("MASUKKAN ANGKA KEDUA");
        int B = in.nextInt();
        
        int perkalian = A * B;
        int pembagian = A / B;
        
        System.out.println("HASIL PEERKALIAN = " + perkalian);
        System.out.println("HASIL PEMBAGIAN = " + pembagian);
    }
    
}
