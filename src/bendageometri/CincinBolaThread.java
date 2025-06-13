package bendageometri;

public class CincinBolaThread implements Runnable {
    private int nomor;

    public CincinBolaThread(int nomor) {
        this.nomor = nomor;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((long) (Math.random() * 300)); // jeda acak antar thread
        } catch (InterruptedException e) {
            System.out.println("Thread terganggu: " + e.getMessage());
        }

        // Jari-jari bola antara 2 - 10 cm
        double jariJari = 2 + Math.random() * 8;

        // Jari-jari mayor (jarak dari pusat torus ke pusat tabung)
        double jariJariMajor = 3 + Math.random() * 7;

        // Buat objek CincinBola
        CincinBola cincin = new CincinBola(jariJari, jariJariMajor);

        // Hitung dengan override
        double volume = cincin.hitungVolume();
        double luasPermukaan = cincin.hitungLuasPermukaan();

        // Hitung dengan overload
        double volumeOL = cincin.hitungVolume(jariJari, jariJariMajor);
        double luasOL = cincin.hitungLuasPermukaan(jariJari, jariJariMajor);

        // Output hasil
        String threadName = Thread.currentThread().getName();
        System.out.printf("Thread Cincin Bola #%d (%s)%n", nomor, threadName);
        System.out.printf("Jari-jari: %.2f cm, Jari-jari Major: %.2f cm%n", jariJari, jariJariMajor);
        System.out.printf("Volume (override): %.2f cm³%n", volume);
        System.out.printf("Volume (overload): %.2f cm³%n", volumeOL);
        System.out.printf("Luas Permukaan (override): %.2f cm²%n", luasPermukaan);
        System.out.printf("Luas Permukaan (overload): %.2f cm²%n", luasOL);
        System.out.println("---------------------------------------------------");
    }
}
