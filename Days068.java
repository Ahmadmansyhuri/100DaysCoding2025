package isc100dayscooding;

import java.util.Scanner;

public class Days068 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int angka = in.nextInt();

        for (int i = 0; i < angka; i++) {
            for (int j = 0; j < angka; j++) {
                System.out.print(" # ");
            }
            System.out.println();
        }
    }
}
