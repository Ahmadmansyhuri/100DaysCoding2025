package isc100dayscooding;
import java.util.Scanner;

public class Days064 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai M: ");
        int M = in.nextInt();

        System.out.print("Masukkan nilai N: ");
        int N = in.nextInt();

        long hasil = 1;
        for (int i = 0; i < N; i++) {
            hasil *= M;
        }

        // Mencetak hasil
        System.out.println(M + " pangkat " + N + " = " + hasil);

        in.close();
    }
}
