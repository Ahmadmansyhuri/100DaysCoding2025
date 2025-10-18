package isc100dayscooding;
import java.util.Scanner;

public class Days041 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("====== Program Evaluasi Mentor ======");
        System.out.print("Masukkan Nilai Teori   \t= ");
        int nilaiTeori = in.nextInt();
        System.out.print("Masukkan Nilai Praktik \t= ");
        int nilaiPraktik = in.nextInt();
        System.out.println("-------------------------------------");

        if (nilaiTeori < 0 || nilaiTeori > 100 || nilaiPraktik < 0 || nilaiPraktik > 100) {
            System.out.println("Nilai tidak valid! Harus antara 0 - 100");
        } else {
            System.out.println("\n================================================");
            System.out.println("Nilai Teori   \t: " + nilaiTeori);
            System.out.println("Nilai Praktik \t: " + nilaiPraktik);

            String predikat;
            String keterangan;
            if (nilaiTeori >= 90 && nilaiPraktik >= 90) {
                predikat = "A";
                keterangan = "Lulus Dengan Predikat Sangat Baik";
            }else if (nilaiTeori >= 80 && nilaiPraktik >= 75) {
                predikat = "B";
                keterangan = "Lulus Dengan Predikat Baik";
            }else if (nilaiTeori >= 70 && nilaiPraktik >= 70) {
                predikat = "C";
                keterangan = "Lulus Dengan Predikat Cukup";
            }else {
                predikat = "D";
                keterangan = "Tidak Lulus";
            }
            System.out.println("Predikat     \t: " + predikat);
            System.out.println("Keterangan   \t: " + keterangan);
            System.out.println("\n================================================");
        }
        in.close();
    }
}

