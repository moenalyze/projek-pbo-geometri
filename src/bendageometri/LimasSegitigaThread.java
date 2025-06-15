package bendageometri;

import bendageometri.LimasSegitiga;

public class LimasSegitigaThread implements Runnable{
    private int nomor;

    public LimasSegitigaThread(int nomor) {
        this.nomor = nomor;
    }

    @Override
    public void run() {
        try{
            Thread.sleep((long)(Math.random() * 300));
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        String threadName = Thread.currentThread().getName();

        double sisi = 5 + Math.random() * 20;

        LimasSegitiga limas = new LimasSegitiga(sisi);

        double volume1 = limas.hitungVolume();
        double volume2 = limas.hitungVolume(sisi);

        double luasPermukaan1 = limas.hitungLuasPermukaan();
        double luasPermukaan2 = limas.hitungLuasPermukaan(sisi);

        System.out.printf("Thread Limas Segitiga #%d (%s)%n", nomor, threadName);
        System.out.printf("Sisi: %.2f cm%n", sisi);
        System.out.printf("Volume (default): %.2f cm³%n", volume1);
        System.out.printf("Volume (sisi): %.2f cm³%n", volume2);
        System.out.printf("Luas Permukaan (default): %.2f cm²%n", luasPermukaan1);
        System.out.printf("Luas Permukaan (sisi): %.2f cm²%n", luasPermukaan2);
    }
}
