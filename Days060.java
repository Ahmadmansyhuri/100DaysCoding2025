package isc100dayscooding;
import java.util.Scanner;

public class Days060 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan Nilai N : ");
        int N = in.nextInt();
        
        System.out.println("Angka ganjil dari "+ N + " - 1:");
        for (int i = N; i >= 1; i--) {
            if (i %2 != 0) {
                System.out.println(i + "\t");
            }
        }
        System.out.println("Angka genap dari " + N + " - 1");
        for (int i = N; i >= 1; i--) {
            if (i %2 == 0 ) {
                System.out.println(i + "\t");
            }
        }
        System.out.println();
        in.close();
    }
    
}
