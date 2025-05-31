package thread;

import projekpbo.bangunRuang.Bola;

public class BolaThread implements Runnable {
    private int nomor;

    public BolaThread(int nomor) {
        this.nomor = nomor;
    }

    @Override
    public void run() {
        try {
            // Delay random agar output tidak selalu berurutan rapi
            Thread.sleep((long)(Math.random() * 300));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Generate nilai jari-jari random antara 3 sampai 15 cm
        double jariJari = 3 + Math.random() * 12;

        Bola bola = new Bola(jariJari);
        double luasPermukaan = bola.hitungLuasPermukaan();
        double volume = bola.hitungVolume();

        System.out.printf("Thread Bola #%d | Jari-jari: %.2f cm | Luas Permukaan: %.2f cm² | Volume: %.2f cm³%n",
                nomor, jariJari, luasPermukaan, volume);
    }
}
