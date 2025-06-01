package thread;

import projekpbo.bangunDatar.PersegiPanjang;

public class PersegiPanjangThread implements Runnable {
    private int nomor;
    private double panjang;
    private double lebar;

    public PersegiPanjangThread(int nomor, double panjang, double lebar) {
        this.nomor = nomor;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public PersegiPanjangThread(int nomor) {
        this.nomor = nomor;
    }

    @Override
    public void run() {
        try {
            // Delay random biar output nggak selalu urut
            Thread.sleep((long)(Math.random() * 300));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Generate nilai panjang dan lebar random (contoh aja)
        if (panjang == 0 && lebar == 0) {
            panjang = 5 + Math.random() * 15; // Panjang antara 5-20 cm
            lebar = 3 + Math.random() * 10; // Lebar antara 3-13 cm
        }

        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
        double luas = persegiPanjang.hitungLuas();
        double keliling = persegiPanjang.hitungKeliling();

        System.out.printf("Thread Persegi Panjang #%d | Panjang: %.2f cm | Lebar: %.2f cm | Luas: %.2f cm² | Keliling: %.2f cm%n",
                nomor, panjang, lebar, luas, keliling);
    }
}