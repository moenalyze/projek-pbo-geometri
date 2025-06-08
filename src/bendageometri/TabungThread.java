package bendageometri;

import bendageometri.Tabung;

public class TabungThread implements Runnable {
    private int nomor;

    public TabungThread(int nomor) {
        this.nomor = nomor;
    }

    @Override
    public void run() {
        try {
            // Delay acak agar output thread tidak berurutan rapi
            Thread.sleep((long)(Math.random() * 300));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String threadName = Thread.currentThread().getName();

        // Generate nilai acak untuk parameter tabung
        double jariJari = 3 + Math.random() * 10;   // 3 - 13 cm
        double tinggi = 5 + Math.random() * 20;     // 5 - 25 cm
        double diameter = jariJari * 2;

        // Buat objek Tabung
        Tabung tabung = new Tabung(jariJari, tinggi);

        // Panggil method overload hitungVolume dan hitungLuasPermukaan
        double volume1 = tabung.hitungVolume(); // tanpa parameter
        double volume2 = tabung.hitungVolume(diameter, tinggi); // dengan parameter diameter dan tinggi

        double luasPermukaan1 = tabung.hitungLuasPermukaan(); // tanpa parameter
        double luasPermukaan2 = tabung.hitungLuasPermukaan(diameter, tinggi); // dengan parameter diameter dan tinggi

        // Cetak hasil
        System.out.printf("Thread Tabung #%d (%s)%n", nomor, threadName);
        System.out.printf("Jari-jari: %.2f cm | Diameter: %.2f cm | Tinggi: %.2f cm%n", jariJari, diameter, tinggi);
        System.out.printf("Volume (tanpa parameter): %.2f cm³%n", volume1);
        System.out.printf("Volume (dengan diameter & tinggi): %.2f cm³%n", volume2);
        System.out.printf("Luas Permukaan (tanpa parameter): %.2f cm²%n", luasPermukaan1);
        System.out.printf("Luas Permukaan (dengan diameter & tinggi): %.2f cm²%n", luasPermukaan2);
//        System.out.println("================================================");
    }

}
