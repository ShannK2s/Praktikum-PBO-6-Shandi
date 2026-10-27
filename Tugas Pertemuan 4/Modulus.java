package P4;
import java.util.Scanner;

public class Modulus {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        
        System.out.print("Masukan Bilangan = ");
        int angka = m.nextInt();
        
        if (angka % 2 == 0){
            System.out.println("Bilangan " + angka + "\nAdalah Bilangan Genap");
        }else{
            System.out.println("Bilangan " + angka + "\nAdalah Bilangan Ganjil");
        }
        m.close();
    }
}
