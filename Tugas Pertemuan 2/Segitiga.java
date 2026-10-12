package P2;

public class Segitiga {
    public static void main(String[] args) {
        double a = 6; 
        double b = 8; 
        double luas = 0.5 * a * b;

        double c = Math.sqrt((a * a) + (b * b));
        double keliling = a + b + c;

        System.out.println("Soal No 5");
        System.out.println("Alas (a)     : " + a);
        System.out.println("Tinggi (b)   : " + b);
        System.out.println("Luas Segitiga: " + luas);

        System.out.println();

        // Soal Nomor 6
        System.out.println("Soal No 6");
        System.out.println("Sisi Miring (c): " + c);
        System.out.println("Keliling       : " + keliling);
    }
}