package isc100dayscooding;

import java.util.Scanner;

public class Days033 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan nilai tes ujian universitas anda : ");
        int nilai = in.nextInt();
        boolean gagal = (nilai < 70);
        boolean lulus = !gagal;
        
        System.out.println("lulus : " + lulus );
        System.out.println();
        
        if (lulus) {
            System.out.println("selamat kamu lulus masuk universitas !!");
        } else {
            System.out.println("kamu gagal silahkan coba lagi tahun depan");
            System.out.println("tetap semangat masih ada kesempatan lain hari");
        }
    }
}
