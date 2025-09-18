package isc100dayscooding;

import java.util.Scanner;


public class Days011 {
    public static void main(String[] args) {
         // Membuat objek Scanner
       Scanner input = new Scanner (System.in);
              
        System.out.println("Masukkan untuk String:");
        String untukstring = input.nextLine();
         
        System.out.println("Masukkan untuk byte");
        byte umur = input.nextByte();
        
        System.out.println("Masukkan untuk short");
        short umur2 = input.nextShort();
        
        System.out.println("Masukkan untuk int");
        int umur3 = input.nextInt();
        
        System.out.println("Masukkan untuk long");
        long tanggallahir = input.nextLong();
        
        System.out.println("Masukkan untuk float");
        float nilaiujian = input.nextFloat();
        
        System.out.println("Masukkan untuk double");
        double nilairatarataijazah = input.nextDouble();
        
        System.out.println("Masukkan untuk char");
        char ipk = input.next().charAt(0);
        
        System.out.println("Masukkan untuk boolean");
        boolean mahasiswa = input.nextBoolean();
        
        
        System.out.println("=============PENGGUNAAN SCANNER===================");
        System.out.println("NAMA :" + untukstring);
        System.out.println("UMUR :" + umur);
        System.out.println("UMUR2 :" + umur2);
        System.out.println("UMUR3 :" + umur2);
        System.out.println("TANGGAL LAHIR :" + tanggallahir);
        System.out.println("NILAI UJIAN :" + nilaiujian);
        System.out.println("NILAI RATA RATA IJAZAH :" + nilairatarataijazah);
        System.out.println("IPK :" + ipk);
        System.out.println("MAHASISWA :" + mahasiswa);
        System.out.println("--------------end-----------------");
        input.close(); // Menutup Scanner

    }
    
}
