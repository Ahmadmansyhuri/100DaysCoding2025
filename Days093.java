package isc100dayscooding;

import java.util.Scanner;

public class Days093 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan angka: ");
        double num = in.nextDouble();

        System.out.printf("Ceil  (%.2f) = %.2f\n", num, Math.ceil(num));
        System.out.printf("Floor (%.2f) = %.2f\n", num, Math.floor(num));
        System.out.printf("Round (%.2f) = %d\n", num, Math.round(num));

        in.close();
    }
}
