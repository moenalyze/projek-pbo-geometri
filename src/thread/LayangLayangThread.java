package thread;

import projekpbo.bangunDatar.LayangLayang;

public class LayangLayangThread implements Runnable {
    private int nomor;

    /**
      */
    public LayangLayangThread(int nomor) {
        this.nomor = nomor;
    }

    @Override
    public void run() {
        try {
             Thread.sleep((long) (Math.random() * 300));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         double diagonal1 = 5 + Math.random() * 15;  
        double diagonal2 = 3 + Math.random() * 10;  
        double sisi1     = 5 + Math.random() * 15;  
        double sisi2     = 5 + Math.random() * 15;  

         LayangLayang layang = new LayangLayang(diagonal1, diagonal2, sisi1, sisi2);

         double luas     = layang.hitungLuas();        
        double keliling = layang.hitungKeliling();    

         System.out.printf(
            "Thread Layang-Layang #%d | Diagonal1: %.2f cm | Diagonal2: %.2f cm | Sisi1: %.2f cm | Sisi2: %.2f cm | Luas: %.2f cm² | Keliling: %.2f cm%n",
            nomor, diagonal1, diagonal2, sisi1, sisi2, luas, keliling
        );
    }
}
