package isc100dayscooding;
import java.util.Scanner;


public class Days024 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        System.out.println("Masukkan jari-jari lingkaran : ");
        double radius = in.nextDouble(); 
        
        double pi = Math.PI;
        double luas = pi * radius * radius;
        
        System.out.println("LUAS LINGKARAN = " + luas);
        System.out.printf("LUAS = %.10f%n" , luas);
        
        in.close();
    }
}
