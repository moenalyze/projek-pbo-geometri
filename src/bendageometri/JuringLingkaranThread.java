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

        // Generate nilai acak untuk parameter juring lingkaran
        double jariJari = 5 + Math.random() * 15; // 5 - 20 cm
        double sudut = Math.random() * 360;       // 0 - 360 derajat

        JuringLingkaran jl = new JuringLingkaran(jariJari, sudut);
        
        double luas1 = jl.hitungLuas(); // default
        double luas2 = jl.hitungLuas(jariJari, sudut); // overloeaded
        
        double keliling1 = jl.hitungKeliling(); // default
        double keliling2 = jl.hitungKeliling(jariJari, sudut); // overloeaded
        
//        System.out.printf(
//            "Thread Juring Lingkaran #%d | Jari-jari: %.2f cm | Sudut: %.2f derajat | Luas: %.2f cm² | Keliling: %.2f cm%n",
//            nomor, jariJari, sudut, luas, keliling
//        );

        // Cetak hasil semua perhitungan
        System.out.printf("Thread Juring Lingkaran #%d (%s)%n", nomor, threadName);
        System.out.printf(
            "Jari-jari: %.2f cm | Sudut: %.2f derajat%n",
            jariJari, sudut
        );
        System.out.printf("Luas (default): %.2f cm²%n", luas1);
        System.out.printf("Luas (jarijari & sudut): %.2f cm²%n", luas2);
        System.out.printf("Keliling (default): %.2f cm%n", keliling1);
        System.out.printf("Keliling (jarijari & sudut): %.2f cm%n", keliling2);
        System.out.printf("================================================%n"); // pemisah antar thread
    }
    
}
