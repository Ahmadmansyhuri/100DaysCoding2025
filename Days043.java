package isc100dayscooding;
import java.util.Scanner;

public class Days043 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Angka : ");
        int angka = in.nextInt();

        if (angka % 3 == 0 && angka % 5 == 0) {
            System.out.println("angka ini kelipatan 3 dan 5");
        } else if (angka % 3 == 0) {
            System.out.println("angka ini kelipatan 3");
        } else if (angka % 5 == 0) {
            System.out.println("angka ini kelipatan 5");

        in.close();
    }
 }
}
