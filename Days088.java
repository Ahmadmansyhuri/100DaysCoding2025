package isc100dayscooding;
import java.util.Scanner;

public class Days088 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Jumlah elemen : ");
        int elemen = in.nextInt();
        int [] array = new int [elemen];
        System.out.println();
        
        for (int i = 0; i < elemen; i++) {
            System.out.print("Elemen ke-" + i + " : ");
            array[i] = in.nextInt();
        }
        System.out.println("\nSemua elemen : ");
        for (int nilai : array) {
            System.out.println(nilai);
        }
        in.close();
    }
}
