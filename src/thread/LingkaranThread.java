package thread;

import projekpbo.bangunDatar.Lingkaran;

public class LingkaranThread implements Runnable {
    private int nomor;
    private double jariJari;

    public LingkaranThread(int nomor, double jariJari) {
        this.nomor = nomor;
        this.jariJari = jariJari;
    }

    public LingkaranThread(int nomor) {
        this.nomor = nomor;
    }

    @Override
    public void run() {
        try {
            // Delay random biar output nggak selalu urut
            Thread.sleep((long)(Math.random() * 300));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Generate nilai jari-jari random (contoh aja)
        if (jariJari == 0) {
            jariJari = 5 + Math.random() * 15; // Jari-jari antara 5-20 cm
        }

        Lingkaran lingkaran = new Lingkaran(jariJari);
        double luas = lingkaran.hitungLuas();
        double keliling = lingkaran.hitungKeliling();

        System.out.printf("Thread Lingkaran #%d | Jari-jari: %.2f cm | Luas: %.2f cm² | Keliling: %.2f cm%n",
                nomor, jariJari, luas, keliling);
    }
}