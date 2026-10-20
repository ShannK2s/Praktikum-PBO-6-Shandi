package P3;
import java.util.Scanner;

public class PercetakanNovel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      
        System.out.print("Masukkan jumlah novel yang dicetak : ");
        long jumlahNovel = input.nextLong();

        System.out.print("Masukkan tebal lembar per novel    : ");
        long lembarPerNovel = input.nextLong();

      
        long totalDetik = jumlahNovel * lembarPerNovel;

      
        long hari = totalDetik / 86400;
        long sisaHari = totalDetik % 86400;

        long jam = sisaHari / 3600;
        long sisaJam = sisaHari % 3600;

        long menit = sisaJam / 60;
        long detik = sisaJam % 60;

      
        System.out.println("\n=== WAKTU PEMPROSESAN CETAK ===");
        System.out.println("Total Lembar : " + totalDetik + " lembar");
        System.out.println("Waktu Cetak  : " + hari + " Hari, " + jam + " Jam, " + menit + " Menit, " + detik + " Detik");

        input.close();
    }
}