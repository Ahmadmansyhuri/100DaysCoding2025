package isc100dayscooding;
import java.util.Scanner;

public class Days049 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Silahkan Masukkan nilai ujian Anda : ");
        int a = in.nextInt();
        
        String hasil = (a >= 76)? "Selamat Anda lulus Ujian": "Anda Tidak Lulus ujian";
        System.out.println("\n************************************");
        System.out.println("Hasil : " + hasil);
        System.out.println("************************************");
    }
    
}
