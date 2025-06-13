package bendageometri;

public class TemberengBolaThread implements Runnable {
    private int nomor;

    public TemberengBolaThread(int nomor) {
        this.nomor = nomor;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((long) (Math.random() * 300));
        } catch (InterruptedException e) {
            System.out.println("Thread terganggu: " + e.getMessage());
        }

        // Nilai random jari-jari dan tinggi (tinggi harus <= jari-jari)
        double jariJari = 5 + Math.random() * 5;     // jari-jari: 5–10
        double tinggi = Math.random() * jariJari;   // tinggi < jari-jari

        // Buat objek TemberengBola
        TemberengBola tembereng = new TemberengBola(jariJari, tinggi);

        // Hitung menggunakan method override (tanpa parameter)
        double volume = tembereng.hitungVolume();
        double luas = tembereng.hitungLuas();

        // Hitung menggunakan overload (dengan parameter)
        double volumeOverload = tembereng.hitungVolume(jariJari, tinggi);
        double luasOverload = tembereng.hitungLuas(jariJari, tinggi);

        // Cetak hasil
        String threadName = Thread.currentThread().getName();
        System.out.printf("Thread Tembereng Bola #%d (%s)%n", nomor, threadName);
        System.out.printf("Jari-jari: %.2f cm, Tinggi: %.2f cm%n", jariJari, tinggi);
        System.out.printf("Volume (default): %.2f cm³%n", volume);
        System.out.printf("Volume (overload): %.2f cm³%n", volumeOverload);
        System.out.printf("Luas (default): %.2f cm²%n", luas);
        System.out.printf("Luas (overload): %.2f cm²%n", luasOverload);
        System.out.println("---------------------------------------------------");
    }
}
