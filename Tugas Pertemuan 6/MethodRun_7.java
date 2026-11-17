package P6;

class ThreadBaru extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread baru berjalan - hitungan ke-" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread terganggu.");
            }
        }
    }
}

public class MethodRun_7 {
    public static void main(String[] args) {
        ThreadBaru t1 = new ThreadBaru();
        t1.start();
        
        System.out.println("Program utama (main) selesai dipanggil.");
    }
}