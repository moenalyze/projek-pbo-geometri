package bendageometri;

import bendageometri.Trapesium;

public class TrapesiumThread implements Runnable{
    private int nomor;

    public TrapesiumThread(int nomor) {
        this.nomor = nomor;
    }

    public void run(){
        try{
            Thread.sleep((long)(Math.random()*300));
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        String threadName = Thread.currentThread().getName();

        double sisiSejajar1 = 5 + Math.random() * 20;
        double sisiSejajar2 = 5 + Math.random() * 20;
        double tinggi = 5 + Math.random() * 20;

        Trapesium tp = new Trapesium(sisiSejajar1, sisiSejajar2, tinggi);

        double luas1 = tp.hitungLuas();
        double luas2 = tp.hitungLuas(sisiSejajar1, sisiSejajar2, tinggi);

        double keliling1 = tp.hitungKeliling();
        double keliling2 = tp.hitungKeliling(sisiSejajar1, sisiSejajar2, tinggi);

        System.out.printf("Thread Trapesium #%d (%s)%n", nomor, threadName);
        System.out.printf("Sisi Sejajar 1: %.2f cm | Sisi Sejajar 2: %.2f cm | Tinggi: %.2f cm%n", sisiSejajar1, sisiSejajar2, tinggi);
        System.out.printf("Luas (default): %.2f cm²%n", luas1);
        System.out.printf("Luas (sisiSejajar1, sisiSejajar2, tinggi): %.2f cm²%n", luas2);
        System.out.printf("Keliling (default): %.2f cm%n", keliling1);
        System.out.printf("Keliling (sisiSejajar1, sisiSejajar2, tinggi): %.2f cm%n", keliling2);
    }
}
