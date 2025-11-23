package isc100dayscooding;
import java.util.Scanner;

public class Days077 {
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);   
        System.out.print("Masukkan kalimat [belajar ahmad kamu pasti berhasil] : ");
        String kalimat = in.nextLine();
        String trim = kalimat.trim();
        String sub = kalimat.substring(19,33);
        String ganti = kalimat.replace("ahmad", "mansyhuri");
        
        System.out.println("Kalimat    \t: " + kalimat);
        System.out.println("\n============================");
        System.out.println("Trim       \t: " + trim);
        System.out.println("Substring  \t: " + sub);
        System.out.println("Replace    \t: " + ganti);
    }
}
