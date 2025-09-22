package isc100dayscooding;
import java.util.Scanner;

public class Days015 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.println("MASUKKAN ANGKA PERTAMA :");
        int A = in.nextInt();
        
        System.out.println("MASUKKAN ANGKA KEDUA");
        int B = in.nextInt();
        
        int penjumlahan = A + B;
        int pengurangan = A - B;
        
        System.out.println("HASIL PENJUMLAHAN = " + penjumlahan);
        System.out.println("HASIL PENGURANGAN = " + pengurangan);
        
    }
    
}
