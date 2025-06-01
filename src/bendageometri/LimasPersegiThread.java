package bendageometri;

import bendageometri.LimasPersegi;

public class LimasPersegiThread implements Runnable {
    private int nomor;

    /**
      */
    public LimasPersegiThread(int nomor) {
        this.nomor = nomor;
    }

    @Override
    public void run() {
        try {
             Thread.sleep((long) (Math.random() * 300));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         double sisi = 5 + Math.random() * 15;          
        double tinggiLimas = 5 + Math.random() * 15;   

        // Buat objek LimasPersegi dengan sisi dan tinggi yang diacak
        LimasPersegi limas = new LimasPersegi(sisi, tinggiLimas);

        // Hitung volume dan luas permukaan
        double volume = limas.hitungVolume();                    
        double luasPermukaan = limas.hitungLuasPermukaan();      

        // Cetak hasil dengan format mirip console, beserta penomoran thread
         String threadName = Thread.currentThread().getName();

        System.out.printf("Thread Bola #%d (%s) | Jari-jari: %.2f cm | Luas Permukaan: %.2f cm | Volume: %.2f cm%n",
                nomor, threadName, sisi,tinggiLimas , luasPermukaan, volume);
    }
    
    
}
