package isc100dayscooding;

import java.util.Scanner;

public class Days095 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan nama : ");
        String nama = in.nextLine();
        System.out.print("Masukkan umur : ");
        int umur = in.nextInt();
        System.out.println();
        info(nama, umur);
    }
    static void info (String nama, int umur){
        System.out.println("Nama    \t: " + nama);
        System.out.println("Umur    \t: " + umur + " Tahun");
    }
}
