package isc100dayscooding;

public class Days091 {
    public static int menghitungumur (int lahir, int sekarang) {
        int umur = sekarang - lahir;
        return umur;
    }
    public static void main(String[] args) {
        int umursaya = menghitungumur (2006,2025);
        System.out.println("Umur : " + umursaya + " tahun");
    }
}
