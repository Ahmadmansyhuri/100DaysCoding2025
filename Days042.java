package isc100dayscooding;
import java.util.Scanner;

public class Days042 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan gaji pokok = ");
        double gajipokok = in.nextDouble();
        double p = 0.20;
        double pajak = gajipokok * p;
        double gaji_bersih = gajipokok - pajak;
        
        System.out.println("Gaji pokok       \t= Rp." + gajipokok);
        System.out.println("Pajaknya (20%)   \t= Rp." + pajak);
        System.out.println("Gaji bersih      \t= Rp." + gaji_bersih);
    }
    
}
