package P3;
import java.util.Scanner;

public class HitungGaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Nomor Induk Karyawan   : ");
        String nik = input.nextLine();

        System.out.print(" Nama Karyawan          : ");
        String nama = input.nextLine();

        System.out.print(" Alamat        : ");
        String alamat = input.nextLine();

        System.out.print(" Jabatan       : ");
        String jabatan = input.nextLine();

        
        System.out.print(" Gaji Pokok (p1)   : ");
        long p1 = input.nextLong(); 

        System.out.print(" Tunjangan Jabatan (p2) : ");
        long p2 = input.nextLong(); 

        System.out.print(" Tunjangan Istri (p3)   : ");
        long p3 = input.nextLong();

        System.out.print(" Tunjangan Anak (p4)    : ");
        long p4 = input.nextLong();

       
        long totalGaji = p1 + p2 + p3 + p4;
        long pajakPenghasilan = (long) (0.10 * (p1 + p2 + p4));
        long gajiBersih = totalGaji - pajakPenghasilan;

       
        System.out.println("\n=== GAJI KARYAWAN ===");
        System.out.println("NIK             : " + nik);
        System.out.println("Nama            : " + nama);
        System.out.println("Alamat          : " + alamat);
        System.out.println("Jabatan         : " + jabatan);
        System.out.println("Gaji Pokok      : Rp " + p1);
        System.out.println("Tunj. Jabatan   : Rp " + p2);
        System.out.println("Tunj. Istri     : Rp " + p3);
        System.out.println("Tunj. Anak      : Rp " + p4);
        System.out.println("---------------------------------");
        System.out.println("Total Gaji      : Rp " + totalGaji);
        System.out.println("Pajak (10%)     : Rp " + pajakPenghasilan);
        System.out.println("Gaji Bersih     : Rp " + gajiBersih);

        input.close();
    }
}