/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bendageometri;

import bendageometri.LimasBelahKetupat;

/**
 *
 * @author Khatama
 */
public class LimasBelahKetupatThread implements Runnable {
    private int nomor;
    
    public LimasBelahKetupatThread(int nomor) {
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
        double tinggiLimas = 5 + Math.random() * 20; // 5 - 25
        double tinggiSisiTegak = 5 + Math.random() * 20; // 5 - 25

        BelahKetupat lbk = new LimasBelahKetupat(
            diagonal1, diagonal2, tinggiLimas, tinggiSisiTegak
        );
        
        double volume1 = lbk.hitungVolume(); // default
        double luasPermukaan1 = lbk.hitungLuasPermukaan(); // default
        double volume2 = 0;
        double luasPermukaan2 = 0;
        
        if(lbk instanceof LimasBelahKetupat) {
            volume2 = ((LimasBelahKetupat)lbk).hitungVolume(diagonal1, diagonal2, tinggiLimas, tinggiSisiTegak); // overloaded
            luasPermukaan2 = ((LimasBelahKetupat)lbk).hitungLuasPermukaan(diagonal1, diagonal2, tinggiLimas, tinggiSisiTegak); // overloaded
        }
        

        // Cetak hasil semua perhitungan
        System.out.printf("Thread Limas Belah ketupat #%d (%s)%n", nomor, threadName);
        System.out.printf(
            "Diagonal 1: %.2f cm | Diagonal 2: %.2f cm | Tinggi Limas: %.2f cm | Tinggi Sisi Tegak: %.2f cm%n",
            diagonal1, diagonal2, tinggiLimas, tinggiSisiTegak
        );
        System.out.printf("Volume (default) : %.2f cm³%n", volume1);
        System.out.printf("Volume (diagonal 1, diagonal 2, tinggi limas, & tinggi sisi tegak) : %.2f cm³%n", volume2);
        System.out.printf("Luas Permukaan (default) : %.2f cm³%n", luasPermukaan1);
        System.out.printf("Luas Permukaan (diagonal 1, diagonal 2, tinggi limas, & tinggi sisi tegak) : %.2f cm³%n", luasPermukaan2);
        System.out.printf("================================================%n"); // pemisah antar thread
    }
    
}
