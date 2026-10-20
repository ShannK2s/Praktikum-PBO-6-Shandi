package P3;
import java.io.DataInputStream;

public class HitungBelanja {
    public static void main(String[] args) throws Exception {
        DataInputStream input = new DataInputStream(System.in);

        System.out.print("Nama          : ");
        String nama = input.readLine();

        System.out.print("Total Belanja : ");
        double totalBelanja = Double.parseDouble(input.readLine());

        // Menghapus tanda % otomatis jika user mengetiknya
        System.out.print("Diskon (%)    : ");
        double diskonPersen = Double.parseDouble(input.readLine().replace("%", ""));

        double nominalDiskon = totalBelanja * (diskonPersen / 100);
        double total = totalBelanja - nominalDiskon;

        System.out.print("Bayar         : ");
        double bayar = Double.parseDouble(input.readLine());

        double kembalian = bayar - total;

        System.out.println("\n=== RINCIAN PEMBELANJAAN ===");
        System.out.println("Nama          : " + nama);
        System.out.println("Total Belanja : Rp " + (long) totalBelanja);
        System.out.println("Diskon (%)    : " + (long) diskonPersen + "%");
        System.out.println("Total         : Rp " + (long) total);
        System.out.println("Bayar         : Rp " + (long) bayar);
        System.out.println("Kembalian     : Rp " + (long) kembalian);
    }
}