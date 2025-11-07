package isc100dayscooding;
import java.util.Scanner;

public class Days062 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Nilai N : ");
        int N = in.nextInt();
        int B = 0;
        
        for (int i = 1; i <= N; i++) {
            B += i ;
        }
        System.out.println("penjumlahan dari 1 sampai " + N );
        System.out.println("Hasilnya adalah : " + B);
    }
    
}
