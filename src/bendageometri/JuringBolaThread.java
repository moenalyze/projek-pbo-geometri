package bendageometri;

public class JuringBolaThread implements Runnable {
    private int nomor;

    public JuringBolaThread(int nomor) {
        this.nomor = nomor;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((long) (Math.random() * 300)); // jeda acak antar thread
        } catch (InterruptedException e) {
            System.out.println("Thread terganggu: " + e.getMessage());
        }

        // Nilai jari-jari acak antara 4 - 10
        double jariJari = 4 + Math.random() * 6;

        // Tinggi antara 0 sampai 2 * jari-jari (valid untuk juring)
        double tinggi = Math.random() * (2 * jariJari);

        // Buat objek JuringBola
        JuringBola juring = new JuringBola(jariJari, tinggi);

        // Hitung menggunakan override
        double volume = juring.hitungVolume();
        double luasPermukaan = juring.hitungLuasPermukaan();

        // Hitung menggunakan overload
        double volumeOL = juring.hitungVolume(jariJari, tinggi);
        double luasOL = juring.hitungLuasPermukaan(jariJari, tinggi);

        // Output
        String threadName = Thread.currentThread().getName();
        System.out.printf("Thread Juring Bola #%d (%s)%n", nomor, threadName);
        System.out.printf("Jari-jari: %.2f cm, Tinggi: %.2f cm%n", jariJari, tinggi);
        System.out.printf("Volume (override): %.2f cm³%n", volume);
        System.out.printf("Volume (overload): %.2f cm³%n", volumeOL);
        System.out.printf("Luas Permukaan (override): %.2f cm²%n", luasPermukaan);
        System.out.printf("Luas Permukaan (overload): %.2f cm²%n", luasOL);
        System.out.println("---------------------------------------------------");
    }
}
