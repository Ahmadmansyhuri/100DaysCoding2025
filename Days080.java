package isc100dayscooding;
import java.util.Scanner;

public class Days080 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in); 
        System.out.print("Masukkan jumlah array : ");
        int a = in.nextInt();       
        int [] array = new int [a];
        
        for (int i = 0; i < a; i++) {
            System.out.println("Masukkan elemen ke-" + i + ": ");
            array [i] = in.nextInt();
        }
        System.out.println("Isi array adalah : ");
        for (int i = 0; i < a; i++) {
            System.out.println("Elemen ke-" + i + ": " + array[i]);
        }
        in.close();  
    }
}
