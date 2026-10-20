//Scanner: Mudah digunakan karena punya built-in parsing untuk tipe data spesifik (seperti nextInt(), nextDouble()). Namun performanya sedikit lebih lambat dan tidak thread-safe.
//
//BufferedReader: Membaca input sebagai buffer teks (String) sehingga performanya jauh lebih cepat dan thread-safe. Namun butuh konversi tipe data manual (misal Integer.parseInt()) serta wajib menangani IOException.

package P3;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 

public class Perbedaan {
    public static void main(String[] args) throws IOException {
        // Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("[Scanner] Masukkan umur: ");
        int umurScanner = sc.nextInt();

        // BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("[BufferedReader] Masukkan umur: ");
        int umurReader = Integer.parseInt(br.readLine());

        System.out.println("Hasil Scanner: " + umurScanner + " | Hasil Reader: " + umurReader);
    }
}
