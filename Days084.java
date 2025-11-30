package isc100dayscooding;
import java.util.Arrays;
import java.util.Scanner;

public class Days084 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int H = in.nextInt();

        int[] J = new int[N];
        for (int i = 0; i < N; i++) {
            J[i] = in.nextInt();
        }
        Arrays.sort(J);
        int totalLompatan = 0;

        int terbesar = J[N - 1];
        totalLompatan += terbesar;
        H -= terbesar;

        if (H <= 0) {
            System.out.println(totalLompatan);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (J[i] >= H) {
                totalLompatan += J[i];
                break;
            }
        }
        System.out.println(totalLompatan);
        in.close();
    }
}
