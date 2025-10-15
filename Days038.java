package isc100dayscooding;
import java.util.Scanner;

public class Days038 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Masukkan sebuah bilangan : ");
        double bilangan = in.nextDouble();
        
        if (bilangan > 0) {
            System.out.println("Bilangan tersebut bilangan positif.");  
        } else if (bilangan < 0) {
            System.out.println("Bilangan tersebut bilangan negatif.");  
        } else {
            System.out.println("Bilangan tersebut adalah nol.");  
        }
        
        in.close();
    }
    
}
