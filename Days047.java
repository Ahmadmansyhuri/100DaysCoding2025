package isc100dayscooding;
import java.util.Scanner;

public class Days047 {
    public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
        System.out.print("masukkan Tanggal : ");
        int tanggal = in.nextInt();
        
        if (tanggal >= 1 && tanggal <= 7) {
        switch (tanggal){
            case 1:
                System.out.println("Hari Senin");
                break;
            case 2:
                System.out.println("Hari Selasa");
                break;
            case 3:
                System.out.println("Hari Rabu");
                break;
            case 4:
                System.out.println("Hari Kamis");
                break;
            case 5:
                System.out.println("Hari Jum'at");
                break;
            case 6:
                System.out.println("Hari Sabtu");
                break;
            case 7:
                System.out.println("Hari Minggu");
                break;
            default:
                System.out.println("pilihan hari tidak ada !!!");
                break;
        }
        } else {
            System.out.println("Input tanggal tidak valid.program dihentikan \nharap input mulai dari anga 1 - 7 !!!");  
        }
            in.close();
    } 
}
