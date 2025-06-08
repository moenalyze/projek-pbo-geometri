/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bendageometri;

import bendageometri.JajarGenjang;

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
            // Delay acak agar output thread tidak urut rapi
            Thread.sleep((long)(Math.random() * 300));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Ambil nama thread saat ini
        String threadName = Thread.currentThread().getName();

        // Generate nilai acak untuk parameter jajar genjang
        double alas = 5 + Math.random() * 20;              // 5 - 25
        double tinggi = 5 + Math.random() * 20;            // 5 - 25
        double sisiMiring = 5 + Math.random() * 20;        // 5 - 25
        double sudutDerajat = 30 + Math.random() * 60;     // 30 - 90

        // Buat objek JajarGenjang
        JajarGenjang jg = new JajarGenjang(alas, tinggi, sisiMiring);

        // === Panggil semua method ===
        double luas1 = jg.hitungLuas();  // Versi default
        double luas2 = jg.hitungLuas(alas, tinggi); // Overloaded dengan alas dan tinggi
        double luas3 = jg.hitungLuas(alas, sisiMiring, sudutDerajat); // Overloaded dengan sudut

        double keliling1 = jg.hitungKeliling(); // Versi default
        double keliling2 = jg.hitungKeliling(alas, sisiMiring); // Overloaded

        // Cetak hasil semua perhitungan
        System.out.printf("Thread Jajar Genjang #%d (%s)%n", nomor, threadName);
        System.out.printf("Alas: %.2f cm | Tinggi: %.2f cm | Sisi Miring: %.2f cm | Sudut: %.2f°%n",
                          alas, tinggi, sisiMiring, sudutDerajat);
        System.out.printf("Luas (default): %.2f cm²%n", luas1);
        System.out.printf("Luas (alas & tinggi): %.2f cm²%n", luas2);
        System.out.printf("Luas (alas & sisi & sudut): %.2f cm²%n", luas3);
        System.out.printf("Keliling (default): %.2f cm%n", keliling1);
        System.out.printf("Keliling (alas & sisi): %.2f cm%n", keliling2);
//        System.out.println("================================================"); // pemisah antar thread
    }
}