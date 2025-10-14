package isc100dayscooding;
import java.util.Scanner;

public class Days037 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan nilai bilangan : ");
        int nilai_A = in.nextInt();
        
        if (nilai_A %2 == 0) {
            System.out.println("Bilangan Genap.");
        } else {
            System.out.println("Bilangan Ganjil.");
        }
    }
    
}
