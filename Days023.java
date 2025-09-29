package isc100dayscooding;
import java.util.Scanner;

public class Days023 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.println("===MENGHITUNG LUAS PERSEGI PANJANG NYA BERAPA===");
        System.out.println("\n=========================");
        System.out.println("MASUUKAN PANJANG");
        double P = in.nextDouble();
        
        
        System.out.println("MASUKKAN LEBAR NYA BERAPA");
        double L = in.nextDouble();
        System.out.println("---------------------------");
        
        double l = P * L;
        
        System.out.println("\n=================================");
        System.out.println("PANJANG  \t= " +P);
        System.out.println("LEBAR    \t= " + L);
        System.out.println("LUAS DARI PERSEGI PANJANG : " + l);
        System.out.println("-----------------------------------");
        in.close();
    }
}
    
