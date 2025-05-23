package projekpbo.bangunDatar;

import projekpbo.Geometri2D;

public class BelahKetupat extends Geometri2D {
    // Atribut khusus untuk belah ketupat
    protected double diagonal1;
    protected double diagonal2;
    protected double sisi;

    // Constructor untuk BelahKetupat
    public BelahKetupat(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }
   
    // Implementasi metode hitungLuas() untuk belah ketupat
    @Override
    public double hitungLuas() {
        // Rumus luas belah ketupat: 0.5 * diagonal1 * diagonal2
        return 0.5 * diagonal1 * diagonal2;
    }

    // Implementasi metode hitungKeliling() untuk belah ketupat
    @Override
    public double hitungKeliling() {
        // Rumus keliling belah ketupat: 4 × sisi miring
        // Sisi miring dihitung dari √((d1/2)² + (d2/2)²)
        sisi = Math.sqrt(Math.pow((1.0/2.0 * diagonal1), 2) + Math.pow(1.0/2.0 * diagonal2, 2));
        return 4 * sisi;
    }
}
