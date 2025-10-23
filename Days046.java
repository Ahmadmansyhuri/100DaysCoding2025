package isc100dayscooding;
import java.util.Scanner;

public class Days046 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("====== MENU MAKANAN =======");
        System.out.println("1.Nasi Goreng" + "\n2.Ayam Bakar" + "\n3.Bakso" + "\n4.Mie pangsit");
        System.out.print("\nMau makan apa ? silakan masukkan menu : ");
        
        int angka = in.nextInt();
        switch (angka){
            case 1:
                System.out.println("Nasi Goreng");
                System.out.println("Harga : Rp.18.000");
                System.out.println("Ditunggu yaa");
                break;
            case 2:
                System.out.println("Ayam Bakar");
                System.out.println("Harga : Rp.25.000");
                System.out.println("Ditunggu yaa");
                break;
            case 3:
                System.out.println("Bakso");
                System.out.println("Harga : Rp.13.000");
                System.out.println("Ditunggu yaa");
                break;
            case 4:
                System.out.println("Mie Pangsit");
                System.out.println("Harga : Rp.15.000");
                System.out.println("Ditunggu yaa");
                break;
            default :
                System.out.println("Tidak ada daftar menu \nSilahkan pesan sesuai menu");
                
        }
    }
    
}
