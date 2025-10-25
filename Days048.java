package isc100dayscooding;
import java.util.Scanner;

public class Days048 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("==========================");
        System.out.print("Masukkan angka 1 : ");
        double angka1 = in.nextDouble();
        System.out.print("Masukkan angka 2 : ");
        double angka2 = in.nextByte();

        System.out.print("Masukkan operator : ");
        char operator = in.next().charAt(0);
        System.out.println("==========================");

        double hasil;
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("\nHasil : " + angka1 + " + " + angka2 + " = " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("\nHasil : " + angka1 + " - " + angka2 + " = " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println("\nHasil : " + angka1 + " * " + angka2 + " = " + hasil);
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("\nHasil : " + angka1 + " / " + angka2 + " = " + hasil);
                } else {
                    System.out.println("\npembagian tidak boleh mengunakan angka 0 !!! ");
                }
                break;
            default:
                System.out.println("\nOperator tidak sesuai harap perhatikan !!!! ");
        }
        in.close();
    }

}
