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

        // Generate nilai acak untuk diagonal, sisi, dan tinggi prisma
        double tinggi = 5 + Math.random() * 15;             // 5 - 20 cm
        double jariJariAtas = 5 + Math.random() * 15;             // 5 - 20 cm
        double jariJariBawah = 5 + Math.random() * 15;             // 5 - 20 cm

        // Buat objek PrismaLayangLayang dengan parameter acak di atas
        KerucutTerpancung ktp = new KerucutTerpancung(
            tinggi, jariJariAtas, jariJariBawah
        );

        double volume = ktp.hitungVolume();
        double luasPermukaan = ktp.hitungLuasPermukaan();

        // Cetak hasil dengan label sesuai console interaktif
        System.out.printf(
            "Thread Kerucut Terpancung #%d | Tinggi: %.2f cm | Jari-jari atas: %.2f cm | Jari-jari bawah: %.2f cm | Volume: %.2f cm³ | Luas Permukaan: %.2f cm²%n",
            nomor, tinggi, jariJariAtas, jariJariBawah, volume, luasPermukaan
        );
    }
}
