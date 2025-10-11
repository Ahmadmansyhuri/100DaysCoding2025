package isc100dayscooding;
import java.util.Scanner;

public class Days034 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai a : ");
        int a = in.nextInt();
        System.out.print("Masukkan nilai b : ");
        int b = in.nextInt();
        
        boolean hasil = (a < b) && (a > b); 
        boolean hasil2 = (a < b) || (b > a); 
        boolean hasil3 = !(a == b); 

        System.out.println("(a < b) && (a > b) \t: " + hasil);
        System.out.println("(a < b) || (b > a) \t: " + hasil2);
        System.out.println("!(a == b)          \t: " + hasil3);
        
        in.close();
    }

}
