package isc100dayscooding;
import java.util.Scanner;

public class Days069 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Username = "admin";
        String Password = "12345";
        int maxAttempts = 3;
        int attempts = 0;
        boolean isLoggedIn = false;

        while (attempts < maxAttempts && !isLoggedIn) {
            System.out.print("Masukkan username: ");
            String username = in.nextLine();

            System.out.print("Masukkan password: ");
            String password = in.nextLine();

            if (username.equals(Username) && password.equals(Password)) {
                System.out.println("Login berhasil! Selamat datang.");
                isLoggedIn = true;
            } else {
                attempts++;
                if (attempts < maxAttempts) {
                    System.out.println("Login gagal! Coba lagi.");
                } else {
                    System.out.println("Akses ditolak!");
                }
            }
        }
        in.close();
    }
}
    
