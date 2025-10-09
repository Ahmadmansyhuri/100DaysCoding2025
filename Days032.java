package isc100dayscooding;
import java.util.Scanner;

public class Days032 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Dapat beasiswa jika ip semester >= 3.5 atau aktif dalam organisasi");
        System.out.print("Masuukan ip semester : ");
        double ip =in.nextDouble();
        
        System.out.print("Apakah kamu aktif organisasi di kampus : ");
        boolean aktif_organisasi = in.nextBoolean();
        
        if (ip >= 3.5 || aktif_organisasi) {
            System.out.println("Selamat! Kamu lolos mendapatkan beasiswa Rp 1.000.000.");
        } else {
            System.out.println("Belum lolos, tingkatkan IP atau masuk organisasi.");
        }
        
        in.close();
    }
    
}
