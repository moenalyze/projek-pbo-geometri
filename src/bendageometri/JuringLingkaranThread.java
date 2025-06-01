/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bendageometri;

import bendageometri.JuringLingkaran;

/**
 *
 * @author Khatama
 */
public class JuringLingkaranThread implements Runnable {
    private int nomor;
    
    public JuringLingkaranThread(int nomor) {
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

        double jariJari = 5 + Math.random() * 15; // 5 - 20 cm
        double sudut = Math.random() * 360;       // 0 - 360 derajat

        JuringLingkaran jl = new JuringLingkaran(jariJari, sudut);
        double luas = jl.hitungLuas();
        double keliling = jl.hitungKeliling();
        
        System.out.printf(
            "Thread Juring Lingkaran #%d | Jari-jari: %.2f cm | Sudut: %.2f derajat | Luas: %.2f cm² | Keliling: %.2f cm%n",
            nomor, jariJari, sudut, luas, keliling
        );
    }
    
}
