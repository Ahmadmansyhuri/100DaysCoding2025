package isc100dayscooding;
import java.util.Scanner;

public class Days083 {
    public static void main(String[] args) {
      Scanner in = new Scanner (System.in); 
        System.out.print("Masukkan jumlah elemen array : ");
        int n = in.nextInt();
        int [] array = new int [n];
        int a = 0;
        
        System.out.println("Masukkan elemem array : ");
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
            a += array[i];
        }
        System.out.println("Jumlah elemen array adalah : " + a);
    }
}
