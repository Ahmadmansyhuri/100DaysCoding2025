package isc100dayscooding;
import java.util.Scanner;

public class Days058 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan N : ");
        int N = in.nextInt();
        
        System.out.println("\n=====================");
        for (int i = 1; i <= N; i++) {
            System.out.println("Angka 1-"+N+" : " + i);
        }
        System.out.println("=====================");
        
        System.out.println("\n=====================");
        for (int i = N; i >= 1; i--) {
            System.out.println("Angka "+N+"-1 : " + i);
        }
        System.out.println("=====================");
        in.close();
    }
    
}
