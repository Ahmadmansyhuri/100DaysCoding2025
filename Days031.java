package isc100dayscooding;

import java.util.Scanner;

public class Days031 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan angka : ");
        int angka = in.nextInt();
        
        if (angka %2 == 0 && angka > 0) {
            System.out.println("Bilangan ini genap dan positif.");
        } else {
            System.out.println("Bilangan tidak memenuhi kriteria (bukan genap maupun positif).");
        }
          in.close();
    }
    
}
