/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bendageometri;

import bendageometri.KerucutTerpancung;

/**
 *
 * @author Khatama
 */
public class KerucutTerpancungThread implements Runnable {
     private int nomor;

    public KerucutTerpancungThread(int nomor) {
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
        
        String threadName = Thread.currentThread().getName();

        // Generate nilai acak untuk diagonal, sisi, dan tinggi prisma
        double tinggi = 5 + Math.random() * 15;             // 5 - 20 cm
        double jariJariAtas = 5 + Math.random() * 15;             // 5 - 20 cm
        double jariJariBawah = 5 + Math.random() * 15;             // 5 - 20 cm

        // Buat objek PrismaLayangLayang dengan parameter acak di atas
        KerucutTerpancung ktp = new KerucutTerpancung(
            tinggi, jariJariAtas, jariJariBawah
        );

        double volume1 = ktp.hitungVolume(); // default
        double volume2 = ktp.hitungVolume(tinggi, jariJariAtas, jariJariBawah); // overloaded
        double luasPermukaan1 = ktp.hitungLuasPermukaan(); // default
        double luasPermukaan2 = ktp.hitungLuasPermukaan(); // overloaded

        // Cetak hasil dengan label sesuai console interaktif
        System.out.printf("Thread Kerucut Terpancung #%d (%s)%n", nomor, threadName);
        System.out.printf(
            "Tinggi: %.2f cm | Jari-jari atas: %.2f cm | Jari-jari bawah: %.2f cm%n",
            tinggi, jariJariAtas, jariJariBawah
        );
        System.out.printf("Volume (default) : %.2f cm³%n", volume1);
        System.out.printf("Volume (tinggi, jariJariAtas, jariJariBawah) : %.2f cm³%n", volume2);
        System.out.printf("Luas Permukaan (default) : %.2f cm³%n", luasPermukaan1);
        System.out.printf("Luas Permukaan (tinggi, jariJariAtas, jariJariBawah) : %.2f cm³%n", luasPermukaan2);
        System.out.printf("================================================%n"); // pemisah antar thread
    }
}
