package P5;
import java.util.Scanner;

public class Penjumlahan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukan Jumlah Yang Mau Diinput : ");
        int Jumlahbil = s.nextInt();
        
        double total = 0;
        
        for (int i = 1; i <= Jumlahbil; i++){
            System.out.print("Masukan bilangan ke - " + " : ");
            double bil = s.nextDouble();
            total += bil;
        }
        double rata2 = total / Jumlahbil;
        
        System.out.println("==========\n");
        System.out.println("Total Jumlah Bilangan : " + total);
        System.out.println("Rata Rata             : " + (float) rata2);
    }
}
