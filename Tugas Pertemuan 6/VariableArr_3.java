package P6;

import java.util.Arrays;
import java.util.Scanner;

public class VariableArr_3 {
    public static void main(String[] args) {
        Scanner Arr = new Scanner(System.in);

        // a. masukkan jumlah elemen array satu dimensi
        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = Arr.nextInt();
        int[] data = new int[jumlah];

        // b. memasukkan nilai elemen sesuai dengan jumlah elemennya
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan elemen ke " + i + " (indeks " + i + "): ");
            data[i] = Arr.nextInt();
        }

        // c. menampilkan nilai terbesar, terkecil, beserta posisi indeksnya
        int max = data[0], min = data[0];
        int indeksMax = 0, indeksMin = 0;

        for (int i = 1; i < jumlah; i++) {
            if (data[i] > max) {
                max = data[i];
                indeksMax = i;
            }
            if (data[i] < min) {
                min = data[i];
                indeksMin = i;
            }
        }
        System.out.println("\n--- Hasil Analisis ---");
        System.out.println("Nilai terbesar : " + max + " (pada indeks ke : 3" + indeksMax + ")");
        System.out.println("Nilai terkecil : " + min + " (pada indeks ke : " + indeksMin + ")");

        // d. jumlahkan semua data array dan cari nilai rata-ratanya
        int totalSemua = 0;
        for (int nilai : data) {
            totalSemua += nilai;
        }
        double rataRata = (double) totalSemua / jumlah;
        System.out.println("Total semua elemen : " + totalSemua);
        System.out.println("Nilai rata-rata    : " + rataRata);

        // e & f. penjumlahan indeks ganjil (NPM genap) atau indeks genap (NPM ganjil)
        System.out.print("\nMasukkan digit terakhir NPM Anda: ");
        int npmAkhir = Arr.nextInt();
        int totalIndeks = 0;

        if (npmAkhir % 2 == 0) {
            // e. NPM Genap -> Jumlahkan elemen berindeks ganjil
            for (int i = 1; i < jumlah; i += 2) {
                totalIndeks += data[i];
            }
            System.out.println("Jumlah elemen berindeks ganjil (NPM Genap): " + totalIndeks);
        } else {
            // f. NPM Ganjil -> Jumlahkan elemen berindeks genap
            for (int i = 0; i < jumlah; i += 2) {
                totalIndeks += data[i];
            }
            System.out.println("Jumlah elemen berindeks genap (NPM Ganjil): " + totalIndeks);
        }

        // g. cek apakah hasil penjumlahan langkah e atau f bernilai ganjil atau genap
        if (totalIndeks % 2 == 0) {
            System.out.println("Status hasil penjumlahan indeks: GENAP");
        } else {
            System.out.println("Status hasil penjumlahan indeks: GANJIL");
        }

        // h. urutkan elemen array yang telah dibuat (dari kecil ke besar)
        Arrays.sort(data);
        System.out.println("\nArray setelah diurutkan: " + Arrays.toString(data));
        
        Arr.close();
    }
}