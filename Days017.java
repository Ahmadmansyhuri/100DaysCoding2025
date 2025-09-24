package isc100dayscooding;
import java.util.Scanner;

public class Days017 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("MASUKKAN ANGKA ");
        int A = in.nextInt();
        
        
        int modulus = A % 2;
        
        System.out.println("HASIL modulus = " + modulus);
    }
    
}
