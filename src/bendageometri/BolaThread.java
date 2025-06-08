package bendageometri;

import bendageometri.Bola;

public class BolaThread implements Runnable {
    private int nomor;

    public BolaThread(int nomor) {
        this.nomor = nomor;
    }

    @Override
public void run() {
    try {
        // Delay random agar output tidak selalu berurutan rapi
        Thread.sleep((long)(Math.random() * 300));
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    // Generate nilai jari-jari random antara 3 sampai 15 cm
    double jariJari = 3 + Math.random() * 12;

    Bola bola = new Bola(jariJari);

    // Panggil versi default (dengan atribut objek)
    double luasPermukaanDefault = bola.hitungLuasPermukaan();
    double volumeDefault = bola.hitungVolume();

    // Panggil versi overload (dengan parameter eksplisit)
    double luasPermukaanOverload = bola.hitungLuasPermukaan(jariJari);
    double volumeOverload = bola.hitungVolume(jariJari);

    // Ambil nama thread yang menjalankan task ini
    String threadName = Thread.currentThread().getName();

    // Cetak hasil perhitungan
    System.out.printf("Thread Bola #%d (%s)%n", nomor, threadName);
    System.out.printf("Jari-jari: %.2f cm%n", jariJari);
    System.out.printf("Luas Permukaan (default): %.2f cm²%n", luasPermukaanDefault);
    System.out.printf("Luas Permukaan (overload): %.2f cm²%n", luasPermukaanOverload);
    System.out.printf("Volume (default): %.2f cm³%n", volumeDefault);
    System.out.printf("Volume (overload): %.2f cm³%n", volumeOverload);
//    System.out.println("===========================================================");
}

}
