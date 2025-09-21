package isc100dayscooding;

public class Days014 {
    public static void main(String[] args) {
        String Biodata = "BIODATA_AHMAD MANSYHURI";
        String nama = "AHMAD MANSYHURI";
        String usia = "19";
        byte umur = Byte.parseByte(usia);
        
        String bulanlahir = "9";
        short bl = Short.parseShort(bulanlahir);
        
        String angka = "170906";
        int tanggallahir = Integer.parseInt(angka);
        
        String nomorwa = "6283865303620";
        long nomor = Long.parseLong(nomorwa);
        
        String nilairatarataijazah = "89.9";
        float nilaiijazah = Float.parseFloat(nilairatarataijazah);
        
        String nilaiujian = "96.7";
        double nilai = Double.parseDouble(nilaiujian);
        
        String jeniskelamin = "L";
        char JK = jeniskelamin.charAt(0);
        
        String status = "true";
        boolean status1 = Boolean.parseBoolean(status);
        
        System.out.println("==== KONVERSI (MENGUBAH STRING JADI TIPE DATA PRMITIF) ====");
        System.out.println(Biodata);
        System.out.println("NAMA                       \t= " + nama);
        System.out.println("UMUR                       \t= " + usia + " TAHUN ");
        System.out.println("BULAN LAHIR                \t= " + bl + "(SEPTEMBER)");
        System.out.println("TANGGAL LAHIR              \t= " + tanggallahir);
        System.out.println("NOMOR WHATSAPP             \t= " + nomor);
        System.out.println("NILAI RATA RATA IJAZAH     \t= " + nilaiijazah);
        System.out.println("NILAI UJIAN                \t= " + nilai);
        System.out.println("JENIS KELAMIN              \t= " + JK);
        System.out.println("STATUS MAHASISWA           \t= "+ status1);
        System.out.println("--------------------------=end=-------------------------");

    }
    
}
