package P5;
import java.util.Scanner;

public class Ganjil {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukan angka : ");
        int n = s.nextInt();
        
        int total = 0;
        int AngkaGanjil = 1;
        
        for(int i = 1; i <= n; i++){
            System.out.print(AngkaGanjil + ",");
            total += AngkaGanjil;
            AngkaGanjil += 2;
        }
        System.out.println();
        System.out.println("Total Penjumlahan : " + total);
    }
}
