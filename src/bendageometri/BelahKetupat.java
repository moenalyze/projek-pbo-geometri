package bendageometri;

import bendageometri.Geometri2D;

public class BelahKetupat extends Geometri2D {
    // Atribut khusus untuk belah ketupat
    protected double diagonal1;
    protected double diagonal2;
    protected double sisi;
    private double luas;
    private double keliling;

    // Constructor untuk BelahKetupat bertipe double
    public BelahKetupat(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        sisi = Math.sqrt((Math.pow((1.0/2.0 * diagonal1), 2) + Math.pow(1.0/2.0 * diagonal2, 2)));
    }
    
    // overloading untuk parameter bilangan bulat
    public BelahKetupat(int diagonal1, int diagonal2) { // ******
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        // Sisi miring dihitung dari √((d1/2)² + (d2/2)²)
        sisi = Math.sqrt((Math.pow((1.0/2.0 * diagonal1), 2) + Math.pow(1.0/2.0 * diagonal2, 2)));
    }
    
    public double hitungSisi() {
        sisi = Math.sqrt((Math.pow((1.0/2.0 * diagonal1), 2) + Math.pow(1.0/2.0 * diagonal2, 2)));
        return sisi;
    }
   
    // Implementasi metode hitungLuas() untuk belah ketupat
    @Override
    public double hitungLuas() {
        // Rumus luas belah ketupat: 0.5 * diagonal1 * diagonal2
        luas = 0.5 * diagonal1 * diagonal2;
        return luas;
    }

    // Implementasi metode hitungKeliling() untuk belah ketupat
    @Override
    public double hitungKeliling() {
        // Rumus keliling belah ketupat: 4 × sisi miring
        keliling = 4 * sisi;
        return keliling;
    }
    
    public double getLuas() {
        return luas;
    }
    
    public double getKeliling() {
        return keliling;
    }
}
