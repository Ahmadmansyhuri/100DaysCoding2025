package isc100dayscooding;
import java.util.Scanner;

public class Days025 { 
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("MASUKKAN NILAI A : ");
        short A = in.nextShort();
        System.out.println("MASUKKAN NILAI B : ");
        short B = in.nextShort();
        // INCREMENT (++)
        System.out.println("=======================");
        System.out.println("Nilai awal A : " +A);
        A++;
        System.out.println("Setelah A++ : " + A);
        System.out.println("Setelah ++A : " + A);
        // DECREMENT (--)
        System.out.println("Nilai awal B : " + B);
        B--;
        System.out.println("Setelah B-- : " + B);
        System.out.println("Setelah --B : " + B);
        System.out.println("-----------------------");
        
        // Contoh perbedaan prefix dan postfix
        System.out.println("MASUKAN NILAI C : ");
        int C = in.nextInt();
        System.out.println("\n============================");
        System.out.println("Nilai c awal: " + C);
        System.out.println("Postfix c++: " + (C++)); 
        System.out.println("Nilai c sekarang: " + C);
        System.out.println("MASUKKAN NILAI D : ");
        int D = in.nextInt();
        System.out.println("Nilai d awal: " + D);
        System.out.println("Prefix ++d: " + (++D)); 
        System.out.println("Nilai d sekarang: " + D);
        System.out.println("------------------------------");
    }
    
}
