package isc100dayscooding;

import java.util.Scanner;

public class Days099 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan N : ");
        int N = in.nextInt();

        for (int i = 2; i <= N; i++) {
            int pembagi = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    pembagi++;
                }
            }
            if (pembagi == 2) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        in.close();
    }
}
