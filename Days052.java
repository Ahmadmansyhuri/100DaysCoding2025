package isc100dayscooding;
import java.util.Scanner;

public class Days052 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan angka awal : ");
        int a = in.nextInt();
        System.out.print("Masukkan angka akhir : ");        
        int b = in.nextInt();
        while (a <= b){
            if (a %2 == 0) {
            System.out.println(a + " : Angka ini bilangan genap");    
            } else {
                System.out.println(a + " : angka ini bilangan ganjil");
            }
              a++;
        }
           in.close();
    }
    
}
