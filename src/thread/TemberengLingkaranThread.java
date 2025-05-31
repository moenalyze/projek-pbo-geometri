/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */package thread;

import projekpbo.bangunDatar.TemberengLingkaran;

public class TemberengLingkaranThread implements Runnable {
    private int nomor;

    // Konstruktor terima nomor urut
    public TemberengLingkaranThread(int nomor) {
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

        // Generate nilai random untuk parameter tembereng lingkaran
        double jariJari = 5 + Math.random() * 20;   // 5 - 25 cm
        double taliBusur = 1 + Math.random() * (2 * jariJari); // panjang tali busur, tidak lebih dari diameter
        double sudut = 10 + Math.random() * 170;    // sudut 10 - 180 derajat
        double busur = (2 * Math.PI * jariJari) * (sudut / 360.0);  // panjang busur berdasarkan sudut

        TemberengLingkaran tembereng = new TemberengLingkaran(jariJari, taliBusur, sudut, busur);
        double luas = tembereng.hitungLuas();
        double keliling = tembereng.hitungKeliling();

        System.out.printf("Thread TemberengLingkaran #%d | Jari-jari: %.2f cm | Tali Busur: %.2f cm | Sudut: %.2f | Busur: %.2f cm | Luas: %.2f cm | Keliling: %.2f cm%n",
                nomor, jariJari, taliBusur, sudut, busur, luas, keliling);
    }
}



