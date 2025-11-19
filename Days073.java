package isc100dayscooding;
import java.util.Scanner;

public class Days073 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlah = 0;
        int angka;

        System.out.print("Masukkan angka (jika negatif maka penjumlahan berhenti): ");
        while (true) {
            angka = in.nextInt();
            if (angka < 0) {
                break;
            }
            jumlah += angka;
        }
        System.out.println("Total penjumlahan : " + jumlah);
    }

}
