package bendageometri;

import bendageometri.Persegi;

public class PersegiThread implements Runnable {
    private int nomor;

    /**
     */
    public PersegiThread(int nomor) {
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

        Persegi persegi = new Persegi(sisi);

        double luas = persegi.hitungLuas();           // s × s
        double keliling = persegi.hitungKeliling();   // 4 × s

        System.out.printf(
            "Thread Persegi #%d | Sisi: %.2f cm | Luas: %.2f cm² | Keliling: %.2f cm%n",
            nomor, sisi, luas, keliling
        );
    }
}
