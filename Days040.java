package isc100dayscooding;
import java.util.Scanner;

public class Days040 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, hasil;
        char operator;

        System.out.print("Masukkan nilai a : ");
        a = in.nextDouble();
        System.out.print("Masukkan operator : ");
        operator = in.next().charAt(0);

        System.out.print("Masukkan nilai b : ");
        b = in.nextDouble();

        if (operator == '+') {
            hasil = a + b;
            System.out.println("Hasil penjumlahan : " + hasil);
        } else if (operator == '-') {
            hasil = a - b;
            System.out.println("hasil pengurangan : " + hasil);
        } else if (operator == '*') {
            hasil = a * b;
            System.out.println("hasil perklian : " + hasil);
        } else if (operator == '/') {
            if (b == 0) {
                System.out.println("Eror pembagian dengan nol tidak terdefinisi");
            } else {
                hasil = a / b;
                System.out.println("hasil pembagian : " + hasil);
            }

        } else {
            System.out.println("Operator tidak valid");
        }

        in.close();
    }

}
