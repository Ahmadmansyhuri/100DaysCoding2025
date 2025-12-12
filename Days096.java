package isc100dayscooding;

import java.util.Scanner;

public class Days096 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka pertama : ");
        double c = in.nextDouble();
        System.out.print("Masukkan angka kedua : ");
        double d = in.nextDouble();

        System.out.println("\n========== HASIL OPERASI ==========");
        System.out.printf("Penjumlahan \t: %.2f%n", penjumlahan (c, d));
        System.out.printf("Pengurangan \t: %.2f%n", pengurangan (c, d));
        System.out.printf("Perkalian   \t: %.2f%n", perkalian   (c, d));
        System.out.printf("Pembagian   \t: %.2f%n", pembagian   (c, d));

        in.close();
    }

    static double penjumlahan(double a, double b) {
        return a + b;
    }

    static double pengurangan(double a, double b) {
        return a - b;
    }

    static double perkalian(double a, double b) {
        return a * b;
    }

    static double pembagian(double a, double b) {
        return a / b;
    }
}
