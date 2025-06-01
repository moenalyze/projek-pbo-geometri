package bendageometri;

import bendageometri.PrismaPersegiPanjang;

public class PrismaPersegiPanjangThread implements Runnable {
    private int nomor;
    private double panjang;
    private double lebar;
    private double tinggi;

    public PrismaPersegiPanjangThread(int nomor, double panjang, double lebar, double tinggi) {
        this.nomor = nomor;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public PrismaPersegiPanjangThread(int nomor) {
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
            panjang = 7 + Math.random() * 13;
            lebar = 4 + Math.random() * 9;
            tinggi = 9 + Math.random() * 14;
        }

        PrismaPersegiPanjang prisma = new PrismaPersegiPanjang(panjang, lebar, tinggi);
        double luasPermukaan = prisma.hitungLuasPermukaan();
        double volume = prisma.hitungVolume();

        System.out.printf("Thread Prisma Persegi Panjang #%d | Panjang: %.2f cm | Lebar: %.2f cm | Tinggi: %.2f cm | Luas Permukaan: %.2f cm² | Volume: %.2f cm³%n",
                nomor, panjang, lebar, tinggi, luasPermukaan, volume);
    }
}