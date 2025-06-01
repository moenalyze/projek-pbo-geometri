package bendageometri;

import bendageometri.LimasPersegiPanjang;

public class LimasPersegiPanjangThread implements Runnable {
    private int nomor;
    private double panjang;
    private double lebar;
    private double tinggi;

    public LimasPersegiPanjangThread(int nomor, double panjang, double lebar, double tinggi) {
        this.nomor = nomor;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public LimasPersegiPanjangThread(int nomor) {
        this.nomor = nomor;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((long)(Math.random() * 300));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (panjang == 0 && lebar == 0 && tinggi == 0) {
            panjang = 8 + Math.random() * 12;
            lebar = 5 + Math.random() * 10;
            tinggi = 10 + Math.random() * 15;
        }

        LimasPersegiPanjang limas = new LimasPersegiPanjang(panjang, lebar, tinggi);
        double luasPermukaan = limas.hitungLuasPermukaan();
        double volume = limas.hitungVolume();

        System.out.printf("Thread Limas Persegi Panjang #%d | Panjang: %.2f cm | Lebar: %.2f cm | Tinggi: %.2f cm | Luas Permukaan: %.2f cm² | Volume: %.2f cm³%n",
                nomor, panjang, lebar, tinggi, luasPermukaan, volume);
    }
}