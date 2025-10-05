package isc100dayscooding;
import java.util.Scanner;

public class Days028 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int pinBenar = 170906;
        
        System.out.print("Masukkan PIN Anda (6 digit): ");
        int pinInput = in.nextInt();  
        
        in.close();
        
        if (pinInput == pinBenar) {
            System.out.println("PIN benar! Akses diberikan. (percobaan dari: " + pinInput + " == " + pinBenar + ")");
        } else if (pinInput != pinBenar){
            System.out.println("PIN salah! Akses ditolak.(percobaan dari : " + pinInput + " != " + pinBenar + ")");
        }
    }
}
