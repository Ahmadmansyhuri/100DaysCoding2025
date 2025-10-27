package isc100dayscooding;
import java.util.Scanner;

public class Days050 {
    public static void main(String[] args) {
     Scanner in = new Scanner (System.in);
        System.out.println("Program bilangan ganjil / genap");
        System.out.print("Masukkan angka : ");
        int C = in.nextInt();
        
        String hasil = C %2 == 1? "Ganjil" : "Genap";
        System.out.println("Angka ini " + C + " Adalah bilangan : " + hasil);
    }
    
}
