package P5;

public class PostIncrement {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("--- Yang Menggunakan i++ ---");
        while (i++ < 5) {
            System.out.println("Nilai i : " + i);
        }
    }
}

class PreIncrement {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("--- Yang Menggunakan ++i ---");
        while (++i < 5) {
            System.out.println("Nilai i : " + i);
        }
    }
}