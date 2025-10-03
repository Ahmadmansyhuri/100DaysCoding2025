package isc100dayscooding;
import java.util.Scanner;

public class Days026 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        // operator pengisian dan pengurangan
        System.out.println("==== operator pengurangan ====");
        System.out.print("Masukkan nilai a     \t: ");
        int a = in.nextInt();
        System.out.print("Masukkan nilai b     \t: ");
        int b = in.nextInt();
        b -= a;
        System.out.println("hasil pengurangan  \t: " + b);
        
        // operator pengisian dan penjumlahan
        System.out.println("\n==== operator penjumlahan ====");
        System.out.print("Masukkan nilai c     \t: ");
        int c = in.nextInt();
        System.out.print("Masukkan nilai d     \t: ");
        int d = in.nextInt();
        c += d;
        System.out.println("hasil penjumlahan  \t: " + c);
        
         // operator pengisian dan perkalian
        System.out.println("\n==== operator perkalian ====");
        System.out.print("Masukkan nilai e     \t: ");
        int e = in.nextInt();
        System.out.print("Masukkan nilai f     \t: ");
        int f = in.nextInt();
        e *= f;
        System.out.println("hasil perkalian    \t: " + e);
        
        // operator pengisian dan pembagian 
        System.out.println("\n==== operator pembagian ====");
        System.out.print("Masukkan nilai g     \t: ");
        int g = in.nextInt();
        System.out.print("Masukkan nilai h     \t: ");
        int h = in.nextInt();
        g /= h;
        System.out.println("hasil pembagian    \t: " + g);
        
        // operator pengisian dan sisa bagi
        System.out.println("\n==== operator sisa bagi ====");
        System.out.print("Masukkan nilai i     \t: ");
        int i = in.nextInt();
        System.out.print("Masukkan nilai j     \t: ");
        int j = in.nextInt();
        i %= j;
        System.out.println("Sisa Bagi          \t: " + i);
    }
}
        
