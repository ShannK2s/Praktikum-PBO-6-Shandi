package P6;

import java.util.Scanner;

public class ManyThread_8 extends Thread {

    private int nomorThread;

    public ManyThread_8(int nomorThread) {
        this.nomorThread = nomorThread;
    }

    @Override
    public void run() {
        System.out.println("Thread anak ke-" + nomorThread + " sedang berjalan.");
    }

    public static void main(String[] args) {
        Scanner Thread = new Scanner(System.in);
        System.out.print("Masukkan jumlah thread yang diinginkan: ");
        int jumlah = Thread.nextInt();

        for (int i = 1; i <= jumlah; i++) {
            ManyThread_8 t = new ManyThread_8(i);
            t.start();
        }
        
        Thread.close();
    }
}