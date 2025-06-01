package thread;

import projekpbo.bangunRuang.PrismaLayangLayang;

public class PrismaLayangLayangThread implements Runnable {
    private int nomor;

    public PrismaLayangLayangThread(int nomor) {
        this.nomor = nomor;
    }

    @Override
    public void run() {
        try {
            // Beri jeda acak agar urutan cetak antar-thread tidak selalu rapi
            Thread.sleep((long)(Math.random() * 300));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Generate nilai acak untuk diagonal, sisi, dan tinggi prisma
        double diagonal1 = 5 + Math.random() * 15;             // 5 - 20 cm
        double diagonal2 = 3 + Math.random() * 10;             // 3 - 13 cm
        double sisi1    = 5 + Math.random() * 15;              // 5 - 20 cm
        double sisi2    = 5 + Math.random() * 15;              // 5 - 20 cm
        double tinggiPrisma = 10 + Math.random() * 20;         // 10 - 30 cm

        // Buat objek PrismaLayangLayang dengan parameter acak di atas
        PrismaLayangLayang prisma = new PrismaLayangLayang(
            diagonal1, diagonal2, sisi1, sisi2, tinggiPrisma
        );

        double volume = prisma.hitungVolume();
        double luasPermukaan = prisma.hitungLuasPermukaan();

        // Cetak hasil dengan label sesuai console interaktif
        System.out.printf(
            "Thread PrismaLayangLayang #%d | Diagonal 1: %.2f cm | Diagonal 2: %.2f cm | Sisi 1: %.2f cm | Sisi 2: %.2f cm | Tinggi Prisma: %.2f cm | Volume: %.2f cm³ | Luas Permukaan: %.2f cm²%n",
            nomor, diagonal1, diagonal2, sisi1, sisi2, tinggiPrisma, volume, luasPermukaan
        );
    }
}
