package isc100dayscooding;
import java.util.Scanner;

public class Days012 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("MASUKKAN NAMA UNTUK STRING");
        String NAMA = input.nextLine();
        
        
        System.out.println("MASUKKAN NIM UNTUK STRING");
        String NIM = input.next();
        
        System.out.println("MASUKKAN TANGGALLAHIR UNTUK LONG");
        long TANGGALLAHIR = input.nextLong();
        
        System.out.println("MASUKKAN HOBI");
        String Hobby = input.next();
        
        System.out.println("MASUKKAN UMUR UNTUK BYTE");
        byte UMUR = input.nextByte();
        
        System.out.println("MASUKKAN ALAMAT UNTUK STRING");
        String ALAMAT = input.next();
      
        System.out.println("MASUKAN KELAS UNTUK CHAR");
        char KELAS = input.next().charAt(3);
      
        System.out.println("================BIODATA SAYA=================");
        System.out.println("NAMA          \t= " + NAMA);
        System.out.println("NIM           \t= " + NIM);
        System.out.println("TANGGAL LAHIR \t= " + TANGGALLAHIR);
        System.out.println("ALAMAT        \t= " + ALAMAT);
        System.out.println("UMUR          \t= " + UMUR + " Tahun");
        System.out.println("HOBI          \t= " + Hobby);
        System.out.println("KELAS         \t= " + KELAS);
        System.out.println("----------------SELESAI----------------");

    }
    
}
