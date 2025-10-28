package isc100dayscooding;
import java.util.Scanner;

public class Days051 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan angka : ");
        int angka = in.nextInt();
        for (int i = 0; i <= angka; i++) {
            System.out.println(i + ". Ahmad mansyhuri");   
        }
         in.close(); 
    }
    
}
