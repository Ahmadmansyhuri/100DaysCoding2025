package isc100dayscooding;

import java.util.Scanner;

public class Days097 {

    static double hitungluas(double sisi) {
        return sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi persegi : ");
        double sisi = in.nextDouble();
        double luas = hitungluas(sisi);
        System.out.printf("Luas persegi : %.2f", luas);
        System.out.println();
        in.close();
    }
}
