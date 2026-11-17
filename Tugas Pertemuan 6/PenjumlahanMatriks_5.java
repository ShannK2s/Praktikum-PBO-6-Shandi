package P6;
import java.util.Scanner;

public class PenjumlahanMatriks_5 {
    public static void main(String[] args) {
        Scanner pm = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris matriks: ");
        int baris = pm.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int kolom = pm.nextInt();

        int[][] matriksA = new int[baris][kolom];
        int[][] matriksB = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];
        
        System.out.println("\n--- Input Elemen Matriks A ---");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Matriks A [" + i + "][" + j + "]: ");
                matriksA[i][j] = pm.nextInt();
            }
        }
        
        System.out.println("\n--- Input Elemen Matriks B ---");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Matriks B [" + i + "][" + j + "]: ");
                matriksB[i][j] = pm.nextInt();
            }
        }
        
        System.out.println("\n--- Hasil Penjumlahan Matriks (A + B) ---");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }
        
        pm.close();
    }
}