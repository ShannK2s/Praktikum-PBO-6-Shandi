package P6;

import java.util.Scanner;

public class NilaiRataRata_6 {
  public static void main(String[] args) {
        Scanner Arr = new Scanner(System.in);

        try {
            System.out.print("Masukkan jumlah bilangan: ");
            int jumlah = Arr.nextInt();

            double[] angka = new double[jumlah];
            double total = 0;

            for (int i = 0; i < jumlah; i++) {
                System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                angka[i] = Arr.nextDouble();
                total += angka[i];
            }

            double rataRata = total / jumlah;
            System.out.println("\nTotal penjumlahan : " + total);
            System.out.println("Nilai rata-rata   : " + rataRata);

        } catch (Exception e) {
            System.out.println("\nKesalahan Input: Data yang Anda masukkan bukan bilangan!");
        }
        
        Arr.close();
    }
}