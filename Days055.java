package isc100dayscooding;
import java.util.Scanner;

public class Days055 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Batas Bawah : ");
        int BatasBawah = in.nextInt();
        System.out.print("Batas Atas : ");
        int BatasAtas = in.nextInt();
        System.out.print("Angka : ");
        int angka = in.nextInt();

        if (angka >= BatasBawah && angka <= BatasAtas) {
            System.out.println("YAYAYAYAYA");
        } else {
            System.out.println("NONONONONO");
        }
        in.close();
    }

}
