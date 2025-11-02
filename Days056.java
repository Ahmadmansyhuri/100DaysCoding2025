package isc100dayscooding;
import java.util.Scanner;

public class Days056 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = in.nextInt();
        System.out.println("-----------------" + "\n===================");
        do {
            if (angka % 2 == 0) {
                System.out.println(angka + " bilangan genap");
            } else if (angka % 2 == 1) {
                System.out.println(angka + " bilangan ganjil");
            } else {
                System.out.println("Tidak ada program");
            }
            angka--;
        } while (angka >= 1);
         in.close();
    }

}
