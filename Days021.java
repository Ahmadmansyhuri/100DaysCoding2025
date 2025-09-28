package isc100dayscooding;

public class Days021 {

    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        
        System.out.println("====(nilai variabel sebelum dutukar)====");
        System.out.println("A : " + a);
        System.out.println("B : " + b);
        
        // (Pertukaran Nilai Menggunakan operasi aritmatika):
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("---------------------------");
        System.out.println("\n====(Nilai Variabel setelah ditukar)====");
        System.out.println("NILAI A : " + a);
        System.out.println("NILAI B : " + b);
        System.out.println("----------------------------");
               
    }

}
