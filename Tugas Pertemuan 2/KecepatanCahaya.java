package P2;

public class KecepatanCahaya {
    public static void main(String[] args) {
        double JarakBulan = 384000;
        double JarakMatahari = 152100000;
        double KecepatanCahaya = 300000;
        
        double WaktuKeBulan = JarakBulan / KecepatanCahaya;
        double WaktuKeMatahari = JarakMatahari /KecepatanCahaya;
        
        System.out.println("Waktu Tempuh Buat Ke Bulan = "+ WaktuKeBulan + "detik");
        System.out.println("Waktu Tempuh Buat Ke Matahari = "+ WaktuKeMatahari + "detik");
    }
}
