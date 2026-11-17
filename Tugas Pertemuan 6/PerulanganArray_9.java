package P6;

public class PerulanganArray_9 {

    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 6};

        System.out.println("Perulangan 1 (for biasa):");
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

        System.out.println("\nPerulangan 2 (for-each):");
        for (int nilai : age) {
            System.out.println(nilai);
        }
    }
}