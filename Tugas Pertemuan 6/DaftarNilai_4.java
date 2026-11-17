package P6;
import java.util.Scanner;

public class DaftarNilai_4 {
    public static void main(String[] args) {
        Scanner N = new Scanner (System.in);
        
        System.out.print("Masukan jumlah mahasiswa : ");
        int jumlah = N.nextInt();
        N.nextLine();
        
        String[] nama = new String [jumlah];
        int[] nilai = new int [jumlah];
        String[] status = new String [jumlah];
        
        for(int i = 0; i < jumlah; i++){
            System.out.println("\n Data Mahasiswa Ke : " + (i + 1));
            System.out.print("Nama : ");
            nama [i] = N.nextLine();
            
            System.out.print("Nilai : ");
            nilai[i] = N.nextInt();
            N.nextLine();
            
            if (nilai[i] <= 50) {
                status[i] = "Tidak Lulus";
            }else{
                status [i] = "Lulus";
            }
        }
        System.out.println("\n Daftar Nilai Mahasiswa");
        System.out.println("=============================");
        System.out.println("No\tNama \tNilai \tStatus");
        System.out.println("=============================");
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + "\t" + nama[i] + "\t\t\t" + nilai[i] + "\t" + status[i]) ;
        }
        System.out.println("=================================");
        
        N.close();
    }
}
