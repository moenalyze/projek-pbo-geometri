package bendageometri;

public class LimasLayangLayangThread implements Runnable {
    private int nomor;

    public LimasLayangLayangThread(int nomor) {
        this.nomor = nomor;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((long) (Math.random() * 300));
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        // Generate nilai random untuk parameter limas layang-layang
        double diagonal1 = 5 + Math.random() * 10;         // antara 5 - 15
        double diagonal2 = 5 + Math.random() * 10;
        double sisi1 = 3 + Math.random() * 5;              // sisi lebih pendek
        double sisi2 = 4 + Math.random() * 6;              // sisi lebih panjang
        double tinggiLimas = 6 + Math.random() * 5;        // tinggi limas
        double tinggiSisiTegak1 = 5 + Math.random() * 5;   // tinggi sisi tegak pendek
        double tinggiSisiTegak2 = 5 + Math.random() * 5;   // tinggi sisi tegak panjang

        // Buat objek
        LimasLayangLayang limas = new LimasLayangLayang(
                diagonal1, diagonal2, sisi1, sisi2,
                tinggiLimas, tinggiSisiTegak1, tinggiSisiTegak2
        );

        // Hitung volume & luas permukaan (default)
        double volumeDefault = limas.hitungVolume();
        double luasPermukaanDefault = limas.hitungLuasPermukaan();

        // Hitung volume & luas permukaan (overload)
        double volumeOverload = limas.hitungVolume(
                diagonal1, diagonal2, sisi1, sisi2, tinggiLimas
        );

        double luasPermukaanOverload = limas.hitungLuasPermukaan(
                diagonal1, diagonal2, sisi1, sisi2, tinggiSisiTegak1, tinggiSisiTegak2
        );

        // Info thread
        String threadName = Thread.currentThread().getName();
        System.out.printf("Thread Limas Layang-Layang #%d (%s)%n", nomor, threadName);
        System.out.printf("Diagonal1: %.2f cm, Diagonal2: %.2f cm%n", diagonal1, diagonal2);
        System.out.printf("Sisi1: %.2f cm, Sisi2: %.2f cm%n", sisi1, sisi2);
        System.out.printf("Tinggi Limas: %.2f cm%n", tinggiLimas);
        System.out.printf("Tinggi Sisi Tegak1: %.2f cm, Tegak2: %.2f cm%n", tinggiSisiTegak1, tinggiSisiTegak2);
        System.out.printf("Volume (default): %.2f cm³%n", volumeDefault);
        System.out.printf("Volume (overload): %.2f cm³%n", volumeOverload);
        System.out.printf("Luas Permukaan (default): %.2f cm²%n", luasPermukaanDefault);
        System.out.printf("Luas Permukaan (overload): %.2f cm²%n", luasPermukaanOverload);
        System.out.println("----------------------------------------------------------");
    }
}
