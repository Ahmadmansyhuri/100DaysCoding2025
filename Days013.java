package isc100dayscooding;
import java.util.Scanner;

public class Days013 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("===SELAMAT DATANG DIPROGRAM EVALUASI JAVA===");
        
        System.out.println("MASUKKAN NAMA MENGGUNAKAN STRING");
        String nama = input.nextLine();
        
        System.out.println("MASUKKAN NIM MENGGUNAKAN STRING");
        String nim = input.next();
        
        System.out.println("MASUKKAN USIA MENGUNAKAN INT");
        int usia = input.nextInt();
        
        System.out.println("MASUKKAN TINGGI BADAN MENGGUNAKAN FLOAT");
        float tb = input.nextFloat();
        
        System.out.println("MASUKKAN HOBI MENGGUNAKAN STRING");
        String hobi = input.next();
        
        System.out.println("MASUKKAN STATUS MAHASISWA MENGGUNAKAN BOOLEAN");
        boolean sm = input.nextBoolean();
        
        System.out.println("====BIODATA AHMAD MANSYHURI====");
        System.out.println("NAMA                \t= " + nama);
        System.out.println("NIM                 \t= " + nim);
        System.out.println("UMUR                \t= " + usia);
        System.out.println("TINGGI BADAN        \t= " + tb);
        System.out.println("HOBI                \t= " + hobi);
        System.out.println("STATUS MAHASISWA    \t= " + sm);
        System.out.println("----INILAH BIODATA SAYA-----");
        
        
        System.out.println("\n======Operasi Variabel & Update=======");
        int tabungan = 1000000;
        int tambahan= 5000000;
        int pengeluaran = -2000000;
        int uangtotal = tabungan + tambahan;
        int tabungansisa = uangtotal - pengeluaran;
        
        System.out.println("==UANG DALAM TABUNGAN SETELAH DITAMBAHKAN==");
        System.out.println("UANG = " + uangtotal);
        System.out.println("==UANG TOTAL SETELAH DIKURANGI==");
        System.out.println("UANG = " + tabungansisa);
        
        
        double PHI = 3.14159;
        System.out.print("Masukan jari-jari = ");
        double r = input.nextDouble();
        float L = 0;

        L =(float)(PHI * r * r);
        System.out.println("luas lingkaran = " + L);
        
        System.out.println("\n=======BIODATA AHMAD MANSYHURI========");
        System.out.println("NAMA LENGKAP        \t= " + nama);
        System.out.println("NIM                 \t= " + nim);
        System.out.println("UMUR                \t= " + usia + "tahun");
        System.out.println("TINGGI BADAN        \t= " + tb + "cm" );
        System.out.println("HOBI                \t= " + hobi);
        System.out.println("STATUS MAHASISWA    \t= " + sm);
        System.out.println("TABUNGAN            \t= " + tabungansisa);
        System.out.printf ("LUAS LINGKARAN      \t=%.2f ",L);
        System.out.println("\n------TERIMAKASIH---------");
         
    }
    
}
