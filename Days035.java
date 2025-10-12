package isc100dayscooding;
import java.util.Scanner;

public class Days035 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String username = "admin";
        String password = "12345";

        System.out.print("Masukkan username : ");
        String user = in.nextLine();
        System.out.print("Masukkan password : ");
        String pass = in.nextLine();

        if (username.equals(user) && password.equals(pass)) {
            System.out.println("LOGIN");
        } else {
            System.out.println("GAGAL");
        }
}
}
