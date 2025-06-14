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

        PrismaBelahKetupat pbk = new PrismaBelahKetupat(diagonal1, diagonal2, tinggiPrisma);
        double volume1 = pbk.hitungVolume(); // default
        double volume2 = pbk.hitungVolume(diagonal1, diagonal2, tinggiPrisma); // overloaded
        
        double luasPermukaan1 = pbk.hitungLuasPermukaan(); // default
        double luasPermukaan2 = pbk.hitungLuasPermukaan(diagonal1, diagonal2, tinggiPrisma); // overloaded
        
        System.out.printf("Thread Prisma Belah ketupat #%d (%s)%n", nomor, threadName);
        System.out.printf(
            "Diagonal 1: %.2f cm | Diagonal 2: %.2f cm | Tinggi Prisma: %.2f cm%n",
            diagonal1, diagonal2, tinggiPrisma
        );
        System.out.printf("Volume (default) : %.2f cm³%n", volume1);
        System.out.printf("Volume (diagonal 1, diagonal 2, & tinggi) : %.2f cm³%n", volume2);
        System.out.printf("Luas Permukaan (default) : %.2f cm³%n", luasPermukaan1);
        System.out.printf("Luas Permukaan (diagonal 1, diagonal 2, & tinggi) : %.2f cm³%n", luasPermukaan2);
        System.out.printf("================================================%n"); // pemisah antar thread
    }
    
}
