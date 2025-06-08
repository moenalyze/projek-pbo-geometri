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
        // Tambahkan delay acak agar output antar-thread tidak urut rapi
        Thread.sleep((long)(Math.random() * 300));
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    String threadName = Thread.currentThread().getName();

    // Generate nilai acak
    double alas = 5 + Math.random() * 20;               // 5 - 25
    double tinggiAlas = 5 + Math.random() * 20;         // 5 - 25
    double sisiMiring = 5 + Math.random() * 20;         // 5 - 25
    double sudutDerajat = 30 + Math.random() * 60;      // 30 - 90
    double tinggiPrisma = 5 + Math.random() * 20;       // 5 - 25

    PrismaJajarGenjang prisma = new PrismaJajarGenjang(alas, tinggiAlas, sisiMiring, tinggiPrisma);

    // === Panggil semua versi overload ===
    double volumeDefault = prisma.hitungVolume();
    double volume1 = prisma.hitungVolume(alas, tinggiAlas, tinggiPrisma);
    double volume2 = prisma.hitungVolume(alas, sisiMiring, sudutDerajat, tinggiPrisma);

    double luasPermukaanDefault = prisma.hitungLuasPermukaan();
    double luasPermukaan1 = prisma.hitungLuasPermukaan(alas, tinggiAlas, sisiMiring, tinggiPrisma);
//    double luasPermukaan2 = prisma.hitungLuasPermukaan(alas, sisiMiring, sudutDerajat, tinggiPrisma);

    // === Cetak hasil ===
    System.out.printf("Thread Prisma Jajar Genjanag #%d (%s)%n", nomor, threadName);
    System.out.printf("Alas: %.2f cm | Tinggi Alas: %.2f cm | Sisi Miring: %.2f cm | Sudut: %.2f° | Tinggi Prisma: %.2f cm%n",
            alas, tinggiAlas, sisiMiring, sudutDerajat, tinggiPrisma);

    System.out.printf("Volume (default): %.2f cm³%n", volumeDefault);
    System.out.printf("Volume (alas, tinggiAlas, tinggiPrisma): %.2f cm³%n", volume1);
    System.out.printf("Volume (alas, sisiMiring, sudut, tinggiPrisma): %.2f cm³%n", volume2);

    System.out.printf("Luas Permukaan (default): %.2f cm²%n", luasPermukaanDefault);
    System.out.printf("Luas Permukaan (alas, tinggiAlas, sisiMiring, tinggiPrisma): %.2f cm²%n", luasPermukaan1);
//    System.out.printf("Luas Permukaan (alas, sisiMiring, sudut, tinggiPrisma): %.2f cm²%n", luasPermukaan2);
//    System.out.println("=====================================================================");
}

}
