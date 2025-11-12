package isc100dayscooding;
import java.util.Scanner;

public class Days066 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan jumlah huruf : ");
        int N = in.nextInt();
        
        for (int i = 0; i < N; i++) {
            char huruf = (char)('A'+i);
            System.out.println(huruf);
        }
         in.close();
    }
}
