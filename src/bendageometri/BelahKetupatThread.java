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

        // Generate nilai acak untuk parameter belah ketupat
        double diagonal1 = 5 + Math.random() * 20; // 5 - 25
        double diagonal2 = 5 + Math.random() * 20; // 5 - 25

        BelahKetupat bk = new BelahKetupat(diagonal1, diagonal2);
       
        double luas1 = bk.hitungLuas(); // default
        double luas2 = bk.hitungLuas(diagonal1, diagonal2); // Overloaded 
//        
//        bk.hitungSisi();
//        double sisi = bk.getSisi();
        
        double keliling1 = bk.hitungKeliling(); // default
        double keliling2 = bk.hitungKeliling(diagonal1, diagonal2); // Overloaded

        // Cetak hasil semua perhitungan
        System.out.printf("Thread Belah ketupat #%d (%s)%n", nomor, threadName);
        System.out.printf(
            "Diagonal1: %.2f cm | Diagonal2: %.2f cm%n",
            diagonal1, diagonal2
        );
        System.out.printf("Sisi : %.2f cm%n", bk.getSisi());
        System.out.printf("Luas (default): %.2f cm²%n", luas1);
        System.out.printf("Luas (diagonal1 & diagonal2): %.2f cm²%n", luas2);
        System.out.printf("Keliling (default): %.2f cm%n", keliling1);
        System.out.printf("Keliling (diagonal1 & diagonal2): %.2f cm%n", keliling2);
        System.out.printf("================================================%n"); // pemisah antar thread
    }
}
