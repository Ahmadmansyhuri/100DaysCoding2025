package isc100dayscooding;
import java.util.Scanner;

public class Days076 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan kalimat : ");
        String input = in.nextLine();
        
        System.out.println();
        garis();
        if (input.equals("Halo")) {
            System.out.println("Input sama persis 'Halo");
        } else {
            System.out.println("input tidak sama persis Halo");
        }
        if (input.equalsIgnoreCase("Halo")) {
            System.out.println("inputannya sama dengan Halo tanpa memperhatikan huruf besar / kecil");
        }
        if (input.contains("Java")) {
            System.out.println("inputan mengandung kata 'Java");
        } else {
            System.out.println("inputan tidak mengandung kata 'Java");
        }
        if (input.isEmpty()) {
            System.out.println("Inputan kosong");
        } else {
            System.out.println("inputan tidak kosong");
        }
        garis();
        in.close();
    }
    static void garis (){
        System.out.println("===================================================================");
    }
}
