package P4;
import java.util.Scanner;

public class HitungGaji {
    public static void main(String[] args) {
        Scanner hg = new Scanner (System.in);
        
        System.out.print("Masukan NIK = ");
        String NIK = hg.nextLine();
        
        System.out.print("Masukan Nama = ");
        String Nama = hg.nextLine();
        
        System.out.print("Masukan Kode Golongan 1-4 = ");
        int Golongan = hg.nextInt();
        
        System.out.print("Status Pernikahan = ");
        int Status = hg.nextInt();
        
        System.out.print("Jumlah Anak = ");
        int Ja = hg.nextInt();
        
        double GajiPokok = 0;
        switch (Golongan){
            case 1:
                GajiPokok = 1200000;
                break;
            case 2:
                GajiPokok = 1500000;
                break;
            case 3:
                GajiPokok = 1750000;
                break;
            case 4:
                GajiPokok = 2000000;
                break;
            default:
                System.out.println("Golongan Tidak Valid");
                break;
        }
        
        double tp = 0;
        if (Status == 1){
            tp = 0.10 * GajiPokok;
        }
        
        double ta = 0.50 * GajiPokok * Ja;
        double TotalT = tp + ta;
        double GajiBersih = GajiPokok + TotalT;
        
        System.out.println("\n=== Gaji Karyawan ===\n");
        System.out.println("NIK                         = " + NIK);
        System.out.println("Nama Karyawan               = " + Nama);
        System.out.println("Gaji Pokok                  = " + GajiPokok);
        System.out.println("Tunjangan Pasangan          = " + tp);
        System.out.println("Tunjangan Anak              = " + ta);
        System.out.println("Total Tunjangan             = " + TotalT);
        
        System.out.println("GajiBersih                  = " + GajiBersih);
        
        hg.close();
    }
}
