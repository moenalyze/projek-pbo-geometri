package bendageometri;

import bendageometri.PrismaJajarGenjang;

public class PrismaJajarGenjangThread implements Runnable {
    private int nomor;

    public PrismaJajarGenjangThread(int nomor) {
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

        // Generate nilai random untuk alas, tinggi jajar genjang, sudut lancip, dan tinggi prisma
        double alas = 5 + Math.random() * 15;             // 5 - 20 cm
        double tinggiJajarGenjang = 3 + Math.random() * 10;  // 3 - 13 cm
        double sudutLancip = 20 + Math.random() * 60;     // 20 - 80 derajat
        double tinggiPrisma = 10 + Math.random() * 20;    // 10 - 30 cm

        PrismaJajarGenjang prisma = new PrismaJajarGenjang(alas, tinggiJajarGenjang, sudutLancip, tinggiPrisma);

        double volume = prisma.hitungVolume();
        double luasPermukaan = prisma.hitungLuasPermukaan();

        System.out.printf("Thread PrismaJajarGenjang #%d | Alas: %.2f cm | Tinggi Jajar: %.2f cm | Sudut Lancip: %.2f° | Tinggi Prisma: %.2f cm | Volume: %.2f cm³ | Luas Permukaan: %.2f cm²%n",
            nomor, alas, tinggiJajarGenjang, sudutLancip, tinggiPrisma, volume, luasPermukaan);
    }
}
