/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bendageometri;

import bendageometri.BelahKetupat;

/**
 *
 * @author Khatama
 */
public class BelahKetupatThread implements Runnable {
    private int nomor;
    
    // Konstruktor terima nomor urut
    public BelahKetupatThread(int nomor) {
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

        BelahKetupat bk = new BelahKetupat(diagonal1, diagonal2);
        double luas = bk.hitungLuas();
        double keliling = bk.hitungKeliling();
        
        System.out.printf(
            "Thread Belah Ketupat #%d | Diagonal1: %.2f cm | Diagonal2: %.2f cm | Luas: %.2f cm² | Keliling: %.2f cm%n",
            nomor, diagonal1, diagonal2, luas, keliling
        );
    }
}
