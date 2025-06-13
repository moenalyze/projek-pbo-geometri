package bendageometri;

public class LimasJajarGenjangThread implements Runnable {
    private int nomor;

    public LimasJajarGenjangThread(int nomor) {
        this.nomor = nomor;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((long) (Math.random() * 300));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Generate random values sesuai kebutuhan limas jajar genjang
        double alas = 5 + Math.random() * 15;          // 5–20 cm
        double tinggiAlas = 3 + Math.random() * 10;   // 3–13 cm
        double sisiMiring = 5 + Math.random() * 10;   // 5–15 cm
        double tinggiLimas = 5 + Math.random() * 15;  // 5–20 cm

        LimasJajarGenjang limas = new LimasJajarGenjang(alas, tinggiAlas, sisiMiring, tinggiLimas);

        double volumeDefault = limas.hitungVolume();
        double luasPermDefault = limas.hitungLuasPermukaan();
        
        double luasAlas = alas * tinggiAlas;
        double volumeOverload = limas.hitungVolume(luasAlas, tinggiAlas, tinggiLimas);
        double luasPermOverload = limas.hitungLuasPermukaan(
            // luasAlas,     // luas alas
            alas, tinggiAlas,  // sisi sejajar
            sisiMiring, tinggiAlas // sisi miring + tinggi sisi tegak
        );

        String threadName = Thread.currentThread().getName();

        System.out.printf("Thread #%d (%s)%n", nomor, threadName);
        System.out.printf("Alas=%.2f, TinggiAlas=%.2f, SisiMiring=%.2f, TinggiLimas=%.2f%n",
                          alas, tinggiAlas, sisiMiring, tinggiLimas);
        System.out.printf("Volume default: %.2f cm³%n", volumeDefault);
        System.out.printf("Volume overload: %.2f cm³%n", volumeOverload);
        System.out.printf("Luas permukaan default: %.2f cm²%n", luasPermDefault);
        System.out.printf("Luas permukaan overload: %.2f cm²%n", luasPermOverload);
    }
}
