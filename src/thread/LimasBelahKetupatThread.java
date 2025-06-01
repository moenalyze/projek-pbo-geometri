/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

import projekpbo.bangunRuang.LimasBelahKetupat;

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

        LimasBelahKetupat lbk = new LimasBelahKetupat(
            diagonal1, diagonal2, tinggiLimas, tinggiSisiTegak
        );
        double volume = lbk.hitungVolume();
        double luasPermukaan = lbk.hitungLuasPermukaan();
        
        System.out.printf(
            "Thread Limas Belah Ketupat #%d | Diagonal 1: %.2f cm | Diagonal 2: %.2f cm | Tinggi Limas: %.2f cm | Tinggi Sisi Tegak: %.2f cm | Volume: %.2f cm³ | Luas Permukaan: %.2f cm²%n",
            nomor, diagonal1, diagonal2, tinggiLimas, tinggiSisiTegak, volume, luasPermukaan
        );
    }
    
}
