package bendageometri;

import bendageometri.PrismaTrapesium;

public class PrismaTrapesiumThread implements Runnable{
    private int nomor;

    public PrismaTrapesiumThread(int nomor) {
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

        double sisiSejajar1 = 5 + Math.random() * 20;
        double sisiSejajar2 = 5 + Math.random() * 20;
        double tinggi = 5 + Math.random() * 20;
        double tinggiPrisma = 5 + Math.random() * 20;

        PrismaTrapesium prisma = new PrismaTrapesium(sisiSejajar1, sisiSejajar2, tinggi, tinggiPrisma);

        double volume1 = prisma.hitungVolume();
        double volume2 = prisma.hitungVolume(sisiSejajar1, sisiSejajar2, tinggi, tinggiPrisma);

        double luasPermukaan1 = prisma.hitungLuasPermukaan();
        double luasPermukaan2 = prisma.hitungLuasPermukaan(sisiSejajar1, sisiSejajar2, tinggi, tinggiPrisma);

        System.out.printf("Thread Prisma Segitiga #%d (%s)%n", nomor, threadName);
        System.out.printf("Sisi Sejajar 1: %.2f cm | Sisi Sejajar 2: %.2f cm | Tinggi: %.2f cm | Tinggi Prisma: %.2f cm%n", sisiSejajar1, sisiSejajar2, tinggi, tinggiPrisma);
        System.out.printf("Volume (default): %.2f cm³%n", volume1);
        System.out.printf("Volume (sisiSejajar1, sisiSejajar2, tinggi, tinggiPrisma): %.2f cm³%n", volume2);
        System.out.printf("Luas Permukaan (default): %.2f cm²%n", luasPermukaan1);
        System.out.printf("Luas Permukaan (sisiSejajar1, sisiSejajar2, tinggi, tinggiPrisma): %.2f cm²%n", luasPermukaan2);
    }
}
