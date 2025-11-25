package isc100dayscooding;
import java.util.Scanner;

public class Days079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Buat username: ");
        String usernameAkun = scanner.nextLine();
        System.out.print("Buat password: ");
        String passwordAkun = scanner.nextLine();
        
        System.out.println("Silakan login ke akun Anda.");
        while (true) {
            System.out.print("Masukkan username: ");
            String usernameInput = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String passwordInput = scanner.nextLine();
            
            if (usernameInput.equals(usernameAkun) && passwordInput.equals(passwordAkun)) {
                System.out.println("Login berhasil! Selamat datang, " + usernameAkun);
                break; 
            } else {
                System.out.println("Username atau password salah, coba lagi.");
            }
        }
        
        scanner.close();
    }
}
   
