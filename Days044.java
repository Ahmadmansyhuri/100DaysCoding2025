package isc100dayscooding;

import java.util.Scanner;

public class Days044 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nama : ");
        String nama = in.nextLine();
        System.out.print("Masukkan nilai : ");
        int nilai = in.nextInt();
        String predikat = "";

        if (nilai >= 90) {
            predikat = "A";
        } else if (nilai >= 85) {
            predikat = "B";
        } else if (nilai >= 80) {
            predikat = "C";
        } else if (nilai >= 75) {
            predikat = "D";
        } else {
            predikat = "E";
        }
         System.out.println("\n======================");
         System.out.println("Nama : " + nama);
         System.out.println("Nilai ujian : " + nilai + "\npredikat : " + predikat);
         System.out.println("======================");
    }

}
