package isc100dayscooding;
import java.util.Scanner;

public class Days039 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Pesanan, Porsi;
        int Soto_Ayam, Gado_Gado, Nasi_Uduk, Ayam_Goreng;

        System.out.println("======MENU MAKANAN BY WINN======");
        System.out.println("01. Soto Ayam \n02. Gado-Gado \n03. Nasi Uduk \n04. Ayam Goreng");
        System.out.println("================================");

        System.out.print("\nMasukan nomor pada pesanan : ");
        Pesanan = in.nextInt();
        System.out.print("Masukan berapa porsi : ");
        Porsi = in.nextInt();
        System.out.println("\n=====================");

        System.out.println("=======PESANAN=======");

        if (Pesanan == 1) {
            Soto_Ayam = 13000;
            System.out.println("Soto Ayam : ");
            System.out.println("Harga Rp." + Soto_Ayam);
            System.out.println("Total bayar Rp." + (Soto_Ayam * Porsi));
            System.out.println("=====================");
       
        } else if (Pesanan == 2) {
            Gado_Gado = 11000;
            System.out.println("Gado-Gado : ");
            System.out.println("Harga Rp." + Gado_Gado);
            System.out.println("Total bayar Rp." + (Gado_Gado * Porsi));
            System.out.println("=====================");
        
        } else if (Pesanan == 3) {
            Nasi_Uduk = 14000;
            System.out.println("Nasi Uduk : ");
            System.out.println("Harga Rp." + Nasi_Uduk);
            System.out.println("Total bayar Rp." + (Nasi_Uduk * Porsi));
            System.out.println("=====================");
        
        } else if (Pesanan == 4) {
            Ayam_Goreng = 16000;
            System.out.println("Ayam Goreng : ");
            System.out.println("Harga Rp." + Ayam_Goreng);
            System.out.println("Total bayar Rp." + (Ayam_Goreng * Porsi));
            System.out.println("=====================");
        
        } else {
            System.out.println("Nomor pesanan tidak tersedia.");
            
        }
    }
}
