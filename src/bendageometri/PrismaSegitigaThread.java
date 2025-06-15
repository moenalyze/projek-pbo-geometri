package bendageometri;

import bendageometri.PrismaSegitiga;

public class PrismaSegitigaThread implements Runnable {
    private int nomor;

    public PrismaSegitigaThread(int nomor) {
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
        double tinggiPrisma = 5 + Math.random() * 20;

        PrismaSegitiga prisma = new PrismaSegitiga(sisi, tinggiPrisma);

        double volume1 = prisma.hitungVolume();
        double volume2 = prisma.hitungVolume(sisi, tinggiPrisma);

        double luasPermukaan1 = prisma.hitungLuasPermukaan();
        double luasPermukaan2 = prisma.hitungLuasPermukaan(sisi, tinggiPrisma);

        System.out.printf("Thread Prisma Segitiga #%d (%s)%n", nomor, threadName);
        System.out.printf("Sisi: %.2f° | Tinggi Prisma: %.2f cm%n", sisi, tinggiPrisma);
        System.out.printf("Volume (default): %.2f cm³%n", volume1);
        System.out.printf("Volume (sisi, tinggiPrisma): %.2f cm³%n", volume2);
        System.out.printf("Luas Permukaan (default): %.2f cm²%n", luasPermukaan1);
        System.out.printf("Luas Permukaan (sisi, tinggiPrisma): %.2f cm²%n", luasPermukaan2);
    }
}
