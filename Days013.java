package isc100dayscooding;
import java.util.Scanner;

public class Days013 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("===SELAMAT DATANG DIPROGRAM EVALUASI JAVA===");
        
        System.out.print("MASUKKAN NAMA MENGGUNAKAN STRING               \t: ");
        String nama = input.nextLine();
        
        System.out.print("MASUKKAN NIM MENGGUNAKAN STRING                \t: ");
        String nim = input.next();
        
        System.out.print("MASUKKAN USIA MENGUNAKAN INT                   \t: ");
        int usia = input.nextInt();
        
        System.out.print("MASUKKAN TINGGI BADAN MENGGUNAKAN DOUBLE       \t: ");
        double tb = input.nextFloat();
        
        System.out.print("MASUKKAN HOBI MENGGUNAKAN STRING               \t: ");
        String hobi = input.next();
        
        System.out.print("MASUKKAN STATUS MAHASISWA MENGGUNAKAN BOOLEAN  \t: ");
        boolean sm = input.nextBoolean();
        
        System.out.println("\n====BIODATA AHMAD MANSYHURI====");
        System.out.println("NAMA                \t= " + nama);
        System.out.println("NIM                 \t= " + nim);
        System.out.println("UMUR                \t= " + usia);
        System.out.println("TINGGI BADAN        \t= " + tb);
        System.out.println("HOBI                \t= " + hobi);
        System.out.println("STATUS MAHASISWA    \t= " + sm);
        System.out.println("----INILAH BIODATA SAYA-----");
        
        
        System.out.println("\n======Operasi Variabel & Update=======");
        int tabungan = 1000000;
        int tambahan     = 5000000;
        int pengeluaran  = -2000000;
        int uangtotal    = tabungan + tambahan;
        int tabungansisa = uangtotal - pengeluaran;
        
        System.out.println("==UANG DALAM TABUNGAN SETELAH DITAMBAHKAN==");
        System.out.println("UANG = " + uangtotal);
        System.out.println("==UANG TOTAL SETELAH DIKURANGI==");
        System.out.println("UANG = " + tabungansisa);
        
        
        double PHI = 3.14159;
        System.out.print("Masukan jari-jari = ");
        double r = input.nextDouble();
        float L ;

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
        System.out.printf ("LUAS LINGKARAN      \t= %.2f ",L);
        System.out.println("\n------TERIMAKASIH---------");
         
    }
    
}

        
        
        
        
    
    

