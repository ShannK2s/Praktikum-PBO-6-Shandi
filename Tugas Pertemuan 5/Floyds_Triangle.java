package P5;
import java.util.Scanner;

public class Floyds_Triangle {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        System.out.print("Masukan Jumlah : ");
        int baris = a.nextInt();
        int angka = 1;
        
        for(int i = 1; i <= baris; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(angka + " ");
                angka++;
            }   
            System.out.println();   
        }
    }
}
