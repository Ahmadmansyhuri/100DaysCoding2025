package isc100dayscooding;

import java.util.Scanner;

public class Days098 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan N (jumlah suku ) : ");
        int n = in.nextInt();
        
        if (n <= 0) {
            System.out.println("N harus > 0");
            return;
        }
        int a = 1;
        int b = 1;
        System.out.print("Deret fibanocci : ");
        
        System.out.print(a);
        if (n > 2) {
            System.out.print(" " + b);
        }
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }
}
