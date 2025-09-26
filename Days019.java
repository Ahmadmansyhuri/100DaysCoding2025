package isc100dayscooding;

public class Days019 {
    public static void main(String[] args) {
        // deklarasi tipe data besar (long)
        long nilaiA = 100000;
        
        // konversi manual/paksa dari long ke int
        int nilaiB = (int) nilaiA;
        
        // konversi manual dari int ke short
        short nilaiC = (short) nilaiB;
        
        // konversi manual dari short ke byte
        byte nilaiD = (byte) nilaiC;
        
        // cetak hasil masing masing konversi
        System.out.println("===TIPE DATA BILANGAN BULAT===");
        System.out.println("NILAI LONG   \t: " + nilaiA);
        System.out.println("NILAI INT    \t: " + nilaiB);
        System.out.println("NILAI SHORT  \t: " + nilaiC);
        System.out.println("NILAI BYTE   \t: " + nilaiD);
        System.out.println("-------------------------------");
        
        // deklarasi tipe data besar (double)
        double nilaiE = 45.9998887777777898898;
        
        // konversi manual dari double ke float
        float nilaiF = (float) nilaiE;
        
        // cetak hasil masing masing konversi
        System.out.println("\n=========TIPE DATA BILANGAN DESIMAL=========");
        System.out.println("NILAI DOUBLE \t: " + nilaiE);
        System.out.println("NILAI FLOAT  \t: " + nilaiF);
        System.out.println("--------------------------------------------");
        
        
    }
    
}
