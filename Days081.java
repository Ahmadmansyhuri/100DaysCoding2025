package isc100dayscooding;
import java.util.Scanner;

public class Days081 {
    public static void main(String[] args) {
        Scanner amd = new Scanner(System.in);
        System.out.print("Masukan indeks = ");
        int[] a = {18, 7, 20, 40, 50};
        int b = amd.nextInt();

        if (b >= 0 && b < a.length) {
            System.out.println("Nilai indeks " + b + " = " + a[b]);
        } else {
            System.out.println("Indeks " + b + " tidak valid. Masukkan indeks antara 0 dan " + (a.length - 1));
        }
        
        amd.close();
    }
}
