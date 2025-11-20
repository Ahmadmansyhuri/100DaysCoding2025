package isc100dayscooding;
import java.util.Scanner;

public class Days074 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char lanjut;

        do {
            System.out.println("=== Menu Restoran ===");
            System.out.println("1. Ayam Bakar");
            System.out.println("2. Sate Kambing");
            System.out.println("3. Es Campur");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = in.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih Ayam Bakar");
                    break;
                case 2:
                    System.out.println("Anda memilih Sate Kambing");
                    break;
                case 3:
                    System.out.println("Anda memilih Es Campur");
                    break;
                case 4:
                    System.out.println("Terima kasih, sampai jumpa!");
                    in.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }

            System.out.print("Apakah Anda ingin memilih menu lain? (y/t): ");
            lanjut = in.next().charAt(0);
            System.out.println();

        } while (lanjut == 'y' || lanjut == 'Y');

        System.out.println("Program selesai. Terima kasih!");
        in.close();
    }
}
