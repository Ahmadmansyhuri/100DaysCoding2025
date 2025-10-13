package isc100dayscooding;
import java.util.Scanner;

public class Days036 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan usia Anda : ");
        int usia = in.nextInt();

        // Input kepemilikan KTP (1 untuk ya, 0 untuk tidak)
        System.out.print("Apakah Anda memiliki KTP? : ");
        int punyaKTP = in.nextInt();

        // Nested If Statement
        if (usia >= 18) {
            if (punyaKTP == 1) {
                System.out.println("Anda berhak memilih dalam pemilu!");
            } else {
                System.out.println("Anda memenuhi syarat usia, tapi harus memiliki KTP untuk memilih.");
            }
        } else {
            System.out.println("Anda belum berhak memilih karena usia kurang dari 18 tahun.");
        }

        in.close();

    }
}
