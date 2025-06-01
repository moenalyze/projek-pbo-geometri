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
            // Delay agar output thread tidak rapi berurutan
            Thread.sleep((long) (Math.random() * 300));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        String threadName = Thread.currentThread().getName();

        // Generate nilai acak untuk jari-jari dan tinggi tabung
        double jariJari = 3 + Math.random() * 10;  // 3 - 13 cm
        double tinggi = 5 + Math.random() * 20;    // 5 - 25 cm

        Tabung tabung = new Tabung(jariJari, tinggi);
        double volume = tabung.hitungVolume();
        double luasPermukaan = tabung.hitungLuasPermukaan();

//        System.out.printf("Thread Tabung #%d | Jari-jari: %.2f cm | Tinggi: %.2f cm | Volume: %.2f cm³ | Luas Permukaan: %.2f cm²%n",
//                nomor, jariJari, tinggi, volume, luasPermukaan);
        
        System.out.printf("Thread Tabung #%d (%s) | Jari-jari: %.2f cm | Luas Permukaan: %.2f cm | Volume: %.2f cm%n",
                nomor, threadName, jariJari, tinggi, volume, luasPermukaan);
    }
}
