package bendageometri;

import bendageometri.Segitiga;

public class SegitigaThread implements Runnable {
    private int nomor;

    public SegitigaThread(int nomor) {
        this.nomor = nomor;
    }

    public void run(){
        try{
            Thread.sleep((long)(Math.random()*300));
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        String threadName = Thread.currentThread().getName();

        double sisi = 5 + Math.random()*20;

        Segitiga sg = new Segitiga(sisi);

        double luas1 = sg.hitungLuas();
        double luas2 = sg.hitungLuas(sisi);

        double keliling1 = sg.hitungKeliling();
        double keliling2 = sg.hitungKeliling(sisi);

        System.out.printf("Thread Segitga #%d (%s)%n", nomor, threadName);
        System.out.printf("Sisi: %.2f%n", sisi);
        System.out.printf("Luas (default): %.2f cm²%n", luas1);
        System.out.printf("Luas (sisi): %.2f cm²%n", luas2);
        System.out.printf("Keliling (default): %.2f cm%n", keliling1);
        System.out.printf("Keliling (sisi): %.2f cm%n", keliling2);
    }
}
