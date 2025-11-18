package isc100dayscooding;
import java.util.Scanner;

public class Days072 {
    public static void cetakpolasegitigaterbalik (long baris){
        for (long i = baris; i >= 1; i--) {
           for (int j = 1; j < i; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("masukkan beberapa baris : ");
        long baris = in.nextInt();
        cetakpolasegitigaterbalik(baris);
        
        in.close();
    }
}
