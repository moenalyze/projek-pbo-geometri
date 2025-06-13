package bendageometri;

public class LimasTrapesiumThread implements Runnable {
    private int nomor;

    public LimasTrapesiumThread(int nomor) {
        this.nomor = nomor;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((long) (Math.random() * 300));
        } catch (InterruptedException e) {
            System.out.println("Thread terganggu: " + e.getMessage());
        }

        // Generate nilai random
        double sisi1 = 6 + Math.random() * 4;  // sisi sejajar 1 (6–10)
        double sisi2 = 4 + Math.random() * 4;  // sisi sejajar 2 (4–8)
        double tinggiTrapesium = 4 + Math.random() * 3; // tinggi alas (4–7)

        double tinggiLimas = 6 + Math.random() * 5; // tinggi limas (6–11)
        double tinggiSisiTegak1 = 5 + Math.random() * 5;
        double tinggiSisiTegak2 = 5 + Math.random() * 5;

        // Buat objek limas trapesium
        LimasTrapesium limas = new LimasTrapesium(
                sisi1, sisi2, tinggiTrapesium,
                tinggiLimas,
                tinggiSisiTegak1, tinggiSisiTegak2
        );

        // Perhitungan menggunakan method default (tanpa parameter)
        double volumeDefault = limas.hitungVolume();
        double luasPermukaanDefault = limas.hitungLuasPermukaan();

        // Perhitungan menggunakan method overload
        double luasAlas = 0.5 * (sisi1 + sisi2) * tinggiTrapesium;
        double volumeOverload = limas.hitungVolume(luasAlas, tinggiLimas);
        double luasPermukaanOverload = limas.hitungLuasPermukaan(
                luasAlas,
                sisi1, tinggiSisiTegak1,
                sisi2, tinggiSisiTegak2,
                Math.abs(sisi1 - sisi2) / 2.0, // asumsi sisi miring = selisih sisi sejajar / 2
                tinggiSisiTegak2
        );

        // Cetak hasil
        String threadName = Thread.currentThread().getName();
        System.out.printf("Thread Limas Trapesium #%d (%s)%n", nomor, threadName);
        System.out.printf("s1: %.2f cm, s2: %.2f cm, tinggi alas: %.2f cm%n", sisi1, sisi2, tinggiTrapesium);
        System.out.printf("Tinggi limas: %.2f cm, T. SisiTegak1: %.2f cm, T. SisiTegak2: %.2f cm%n",
                tinggiLimas, tinggiSisiTegak1, tinggiSisiTegak2);
        System.out.printf("Volume (default): %.2f cm³%n", volumeDefault);
        System.out.printf("Volume (overload): %.2f cm³%n", volumeOverload);
        System.out.printf("Luas Permukaan (default): %.2f cm²%n", luasPermukaanDefault);
        System.out.printf("Luas Permukaan (overload): %.2f cm²%n", luasPermukaanOverload);
        System.out.println("----------------------------------------------------------");
    }
}
