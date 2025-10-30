package isc100dayscooding;
import java.util.Scanner;

public class Days053 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka mulai dari mana : ");
        int a = in.nextInt();
        while (a <= 30) {
            System.out.println(a);
            if (a == 15) {
                break;
            }
            System.out.println("Angka : " + a);
            a++;
        }
        System.out.println("Angka dihentikan karena a sudah mencapai 15... ");
        in.close();
    }
}
