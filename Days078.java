package isc100dayscooding;
import java.util.Scanner;

public class Days078 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan kalimat : ");
        String kalimat = in.nextLine();
        garis2(89);
        
        System.out.println();
        garis2(89);
        System.out.println("panjang                       \t: " + kalimat.length());
        System.out.println("Huruf besar                   \t: " + kalimat.toUpperCase());
        System.out.println("Huruf kecil                   \t: " + kalimat.toLowerCase());
        System.out.println("apakah ada huruf a di kalimat \t: " + kalimat.contains("a"));
        System.out.println("mengmbil karakter pertama     \t: " + kalimat.charAt(0));
        System.out.println("ganti 'a' dengan 't'          \t: " + kalimat.replace("a", "t"));
        garis2(89);
    }
    static void garis2 (long N) {
        for (int i = 0; i < N; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
