package isc100dayscooding;

public class Days054 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i == 15 || i == 18) {
             continue;
            }
            System.out.println("Angka " + i);
        }
    }
    
}
