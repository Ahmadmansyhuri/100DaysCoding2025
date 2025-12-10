package isc100dayscooding;

public class Days094 {

    static void pola() {
        System.out.println("========= Latihan cetakpola =========");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("=====================================");
    }

    public static void main(String[] args) {
        pola();
    }
}
