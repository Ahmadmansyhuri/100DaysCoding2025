package isc100dayscooding;
import java.util.Scanner;

public class Days045 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("======= MENU MINUMAN =======");
        System.out.println("1.Cappucino" + "\n2.Kopi Hitam" + "\n3.Jus Jeruk");
        System.out.println("=====================");
        
        System.out.print("\nMasukkan menu minuman : ");
        int angka = in.nextInt();
        switch (angka){
            case 1:
                System.out.println("=========================");
                System.out.println("Cappucino");
                System.out.println("Harga :Rp.10.000 ");
                System.out.println("=========================");
                break;
            case 2:
                System.out.println("=========================");
                System.out.println("Kopi Hitam");
                System.out.println("Harga :Rp.5.000");
                System.out.println("=========================");
                break;
            case 3:
                System.out.println("=========================");
                System.out.println("Jus Jeruk");
                System.out.println("Harga :Rp.15.000");
                System.out.println("=========================");
                break;
            default:
                System.out.println("=========================");
                System.out.println("Tidak ada daftar menu!!!");
                System.out.println("=========================");
                break;
        }
    }
    
}
