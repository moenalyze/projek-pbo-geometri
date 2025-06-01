/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bendageometri;

import bendageometri.PrismaBelahKetupat;

/**
 *
 * @author Khatama
 */
public class PrismaBelahKetupatThread implements Runnable {
    private int nomor;
    
    public PrismaBelahKetupatThread(int nomor) {
        this.nomor = nomor;
    }

    @Override
    public void run() {
        try {
            // Delay random antara 0 - 300 ms agar output tidak berurutan rapi
            Thread.sleep((long)(Math.random() * 300));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Ambil nama thread yang menjalankan task ini
        String threadName = Thread.currentThread().getName();

        double diagonal1 = 5 + Math.random() * 20; // 5 - 25
        double diagonal2 = 5 + Math.random() * 20; // 5 - 25
        double tinggiPrisma = 5 + Math.random() * 20; // 5 - 25

        PrismaBelahKetupat pbk = new PrismaBelahKetupat(
            diagonal1, diagonal2, tinggiPrisma
        );
        double volume = pbk.hitungVolume();
        double luasPermukaan = pbk.hitungLuasPermukaan();
        
        System.out.printf(
            "Thread Prisma Belah Ketupat #%d | Diagonal 1: %.2f cm | Diagonal 2: %.2f cm | Tinggi Prisma: %.2f cm | Volume: %.2f cm³ | Luas Permukaan: %.2f cm²%n",
            nomor, diagonal1, diagonal2, tinggiPrisma, volume, luasPermukaan
        );
    }
    
}
