package isc100dayscooding;

public class Days020 {
    public static void main(String[] args) {
        // tipe data primitif
        int A = 1000;
        double D = 18.89;
        boolean B = true;
        char K = 'A';
        
        // mengubah tipe data primitif menjadi String
        /* disini saya menggunakan metode value of :
         ada 3 metode yang bisa kita gunakan yaitu :
           -metode value of
           -metode.toString 
           -metode operator
        */
        
        String AS = String.valueOf(A);
        String DS = String.valueOf(D);
        String BS = String.valueOf(B);
        String KS = String.valueOf(K);
        
        // menampilkan hasil
        System.out.println("INTEGER KE STRING = " + AS);
        System.out.println("DOUBLE KE STRING  = " + DS);
        System.out.println("BOOLEAN KE STRING = " + BS);
        System.out.println("CHAR KE STRING = " + KS);
    }
    
}
