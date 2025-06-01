/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

import projekpbo.bangunDatar.JajarGenjang;

/**
 *
 * @author Maan
 */

public class JajarGenjangThread implements Runnable {
    private int nomor;

    // Konstruktor terima nomor urut
    public JajarGenjangThread(int nomor) {
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

        double alas = 5 + Math.random() * 20;     // 5 - 25
        double tinggi = 5 + Math.random() * 20;   // 5 - 25
        double sudut = 30 + Math.random() * 60;   // 30 - 90 derajat

        JajarGenjang jg = new JajarGenjang(alas, tinggi, sudut);
        double luas = jg.hitungLuas();
        double keliling = jg.hitungKeliling();
                
        System.out.printf("Thread JajarGenjang #%d (%s) | Jari-jari: %.2f cm | Luas Permukaan: %.2f cm | Volume: %.2f cm%n",
                nomor, threadName, alas, tinggi, sudut, luas, keliling);
    }
}

