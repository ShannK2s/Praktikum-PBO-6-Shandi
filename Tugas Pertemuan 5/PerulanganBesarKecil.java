package P5;
import java.util.Scanner;

public class PerulanganBesarKecil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Menentukan Bilangan Terbesar Dan Terkecil ===");
        System.out.print("Masukkan banyak angka : ");
        int Ja = input.nextInt();
        
        int terbesar = Integer.MIN_VALUE;
        int terkecil = Integer.MAX_VALUE;
        
        for (int i = 1; i <= Ja; i++) {
            System.out.print("Masukkan bilangan ke-" + i + " : ");
            int bil = input.nextInt();
            
            if (bil > terbesar) {
                terbesar = bil;
            }
            if (bil < terkecil) {
                terkecil = bil;
            }
        }
        
        System.out.println("\n------------------------------------");
        System.out.println("Bilangan terbesar : " + terbesar);
        System.out.println("Bilangan terkecil : " + terkecil);
    }
}