package P4;

import java.util.Scanner;

public class KomisiSalesman {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Penjualan Hari Ini = ");
        double penjualan = s.nextDouble();

        double uangJasa = 0;
        double persenKomisi = 0;

       
        if (penjualan <= 2000000) {
            uangJasa = 100000;
            persenKomisi = 0.10; 
        } else if (penjualan <= 5000000) {
            uangJasa = 200000;
            persenKomisi = 0.15; 
        } else {
            uangJasa = 300000;
            persenKomisi = 0.20; 
        }

       
        double komisi = penjualan * persenKomisi;
        double totalPendapatan = uangJasa + komisi;

       
        System.out.println("\n===== Pendapatan Salesman =====");
        System.out.println("Total Penjualan     = " + penjualan);
        System.out.println("Uang Jasa           = " + uangJasa);
        System.out.println("Uang Komisi         = " + komisi);
        System.out.println("---------------------------------------");
        System.out.println("Total Pendapatan    = " + totalPendapatan);

        s.close();
    }
}