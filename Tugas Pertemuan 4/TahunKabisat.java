package P4;
import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
        Scanner k = new Scanner (System.in);
        
        System.out.print("Masukan Tahun = ");
        int Tahun = k.nextInt();
        
        if ((Tahun % 4 == 0 && Tahun % 100 != 0) || (Tahun % 400 == 0)){
            System.out.println("Tahun = " + Tahun + "\nAdalah Tahun Kabisat");
        }else{
            System.out.println("Tahun = " + Tahun + "\nBukan Tahun Kabisat");
        }
    }
}
