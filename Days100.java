package isc100dayscooding;

import java.util.Scanner;

public class Days100 {

    static int[] xBaru;

    static int retas(int[] x) {
        int n = x.length;
        xBaru = new int[n];
        boolean[] cek = new boolean[n];
        int p = 0;

        for (int i = 0; i < n; i++) {
            int pos = x[i] % n;

            while (cek[pos]) {
                pos++;
                p++;
                if (pos == n) {
                    pos = 0;
                }
            }

            xBaru[pos] = x[i];
            cek[pos] = true;
        }
        return p;
    }

    static String susunKode(int p) {
        int n = xBaru.length;
        int start = p % n;          // titik mulai
        int panjang = xBaru[start];

        String s = "";
        int i = start;

        while (s.length() < panjang) {
            s += xBaru[i];
            i++;
            if (i == n) {
                i = 0;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
 
        int p = retas(x);
        System.out.println(susunKode(p));
    }
}
