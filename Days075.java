package isc100dayscooding;
import java.util.Scanner;

public class Days075 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan teks : ");
        String kata = in.nextLine();
        
        System.out.println("Panjang teks : " + kata.length());
        System.out.println("Huruf besar : " + kata.toUpperCase());
        System.out.println("Huruf kecil : " + kata.toLowerCase());
        
        in.close();
    }
}
