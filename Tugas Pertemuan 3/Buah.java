package P3;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Buah {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan jumlah awal Mangga (pcs) [70]: ");
        int manggaAwal = Integer.parseInt(br.readLine());

        System.out.print("Masukkan jumlah Tetangga [4]: ");
        int tetangga = Integer.parseInt(br.readLine());

        System.out.print("Masukkan Jambu per Tetangga (pcs) [30]: ");
        int jambuPerTetangga = Integer.parseInt(br.readLine());

        System.out.print("Masukkan Mangga Busuk (pcs) [15]: ");
        int manggaBusuk = Integer.parseInt(br.readLine());

        int manggaBagus = manggaAwal - manggaBusuk;
        int totalJambu = tetangga * jambuPerTetangga;
        int totalBuahBersih = manggaBagus + totalJambu;

        System.out.println("\n=== RINCIAN BUAH IBU SISCA ===");
        System.out.println("Sisa Mangga Bagus : " + manggaBagus + " pcs");
        System.out.println("Total Jambu Dibeli : " + totalJambu + " pcs");
        System.out.println("Total Buah Akhir   : " + totalBuahBersih + " pcs");
    }
}