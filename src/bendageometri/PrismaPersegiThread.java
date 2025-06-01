package bendageometri;

import bendageometri.PrismaPersegi;

public class PrismaPersegiThread implements Runnable {
    private int nomor;

    public PrismaPersegiThread(int nomor) {
        this.nomor = nomor;
    }

    @Override
    public void run() {
        try {
            // Beri jeda acak agar tiap thread seolah menari dengan ritme tersendiri
            Thread.sleep((long) (Math.random() * 300));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Generate nilai acak untuk sisi alas dan tinggi prisma:
        double sisi = 5 + Math.random() * 15;              // Sisi antara 5–20 cm
        double tinggiprismapersegi = 4 + Math.random() * 9; // Tinggi antara 4–13 cm

        // Buat objek PrismaPersegi dengan dua parameter (sisi dan tinggi)
        PrismaPersegi prisma = new PrismaPersegi(sisi, tinggiprismapersegi);
        double volume = prisma.hitungVolume();
        double luasPermukaan = prisma.hitungLuasPermukaan();

        // Cetak hasil dengan label yang jelas: Sisi, Tinggi Prisma, Volume, Luas Permukaan
        System.out.printf(
            "Thread Prisma Persegi #%d | Sisi: %.2f cm | Tinggi Prisma: %.2f cm | Volume: %.2f cm³ | Luas Permukaan: %.2f cm²%n",
            nomor, sisi, tinggiprismapersegi, volume, luasPermukaan
        );
    }
}
