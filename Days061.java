package isc100dayscooding;
import java.util.Scanner;

public class Days061 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Nilai N:");
        int N = in.nextInt();
        
        System.out.print("bilangan kelipatan M:");
        int M = in.nextInt();
        
        System.out.println("\nBilangan kelipatan " + M + " dari 1 sampai " + N + ":");
        for (int i = 1; i <= N; i++) {
            if (i % M == 0) {
                System.out.print(i + "  ");
            }
        }
        System.out.println();
        in.close();
    }
}
