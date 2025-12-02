package isc100dayscooding;
import java.util.Scanner;

public class Days087 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Jumlah elemen : ");
        int elemen = in.nextInt();
        int [] array = new int [elemen];
        
        for (int i = 0; i < elemen; i++) {
            System.out.print("elemen ke-" + i + " : ");
            array[i] = in.nextInt();
        }
        System.out.print("Cari angka : ");
        int angka = in.nextInt();
        for (int i = 0; i < elemen; i++) {
            if (array[i] == angka) {
                System.out.println("Angka ditemukan pada index : " + i);
                in.close();
                return;
            }
        }
        System.out.println("Angka tidak ditemukan");
        in.close();
    }
}
