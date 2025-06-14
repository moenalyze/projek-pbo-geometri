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
    }
    
    // overloading untuk parameter bilangan bulat
    public BelahKetupat(int diagonal1, int diagonal2) { // ******
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }
    
    // overloading untuk parameter sisi
    public BelahKetupat(double sisi) {
        this.sisi = sisi;
    }
    
    // overloaded method
    public BelahKetupat(int sisi) {
        this.sisi = sisi;
    }
    
    public void hitungSisi() throws IllegalArgumentException {
        try {
            if (diagonal1 <= 0 || diagonal2 <= 0) {
                throw new IllegalArgumentException("Panjang kedua diagonal harus lebih besar dari 0");
            }
            // Sisi miring dihitung dari √((d1/2)² + (d2/2)²)
            sisi = Math.sqrt((Math.pow((1.0/2.0 * diagonal1), 2) + Math.pow(1.0/2.0 * diagonal2, 2)));
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung sisi belah ketupat: " + e.getMessage());
            throw e;
        }        
    }
    
    // overload method
    public void hitungSisi(double diagonal1, double diagonal2) throws IllegalArgumentException {
        try {
            if (diagonal1 <= 0 || diagonal2 <= 0) {
                throw new IllegalArgumentException("Panjang kedua diagonal harus lebih besar dari 0");
            }
            // Sisi miring dihitung dari √((d1/2)² + (d2/2)²)
            sisi = Math.sqrt((Math.pow((1.0/2.0 * diagonal1), 2) + Math.pow(1.0/2.0 * diagonal2, 2)));
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung sisi belah ketupat: " + e.getMessage());
            throw e;
        }
    }
   
    // Implementasi metode hitungLuas() untuk belah ketupat
    @Override
    public double hitungLuas() throws IllegalArgumentException {
        try {
            if (diagonal1 <= 0 || diagonal2 <= 0) {
                throw new IllegalArgumentException("Panjang kedua diagonal harus lebih besar dari 0");
            }
            // Rumus luas belah ketupat: 0.5 * diagonal1 * diagonal2
            luas = 0.5 * diagonal1 * diagonal2;
            return luas;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung luas belah ketupat: " + e.getMessage());
            throw e;
        }
        
    }
    
    // Overloaded method
    public double hitungLuas(double diagonal1, double diagonal2) throws IllegalArgumentException {
        try {
            if (diagonal1 <= 0 || diagonal2 <= 0) {
                throw new IllegalArgumentException("Panjang kedua diagonal harus lebih besar dari 0");
            }
            // Rumus luas belah ketupat: 0.5 * diagonal1 * diagonal2
            luas = 0.5 * diagonal1 * diagonal2;
            return luas;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung luas belah ketupat: " + e.getMessage());
            throw e;
        }
    }

    // Implementasi metode hitungKeliling() untuk belah ketupat
    @Override
    public double hitungKeliling() throws IllegalArgumentException {
        try {
            if (diagonal1 <= 0 || diagonal2 <= 0) {
                throw new IllegalArgumentException("Panjang kedua diagonal harus lebih besar dari 0");
            }
            hitungSisi();
            // Rumus keliling belah ketupat: 4 × sisi miring 
            keliling = 4 * sisi;
            return keliling;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung keliling belah ketupat: " + e.getMessage());
            throw e;
        }
    }
    
    // Overloaded method
    public double hitungKeliling(double diagonal1, double diagonal2) throws IllegalArgumentException {
        try {
            if (diagonal1 <= 0 || diagonal2 <= 0) {
                throw new IllegalArgumentException("Panjang kedua diagonal harus lebih besar dari 0");
            }
            hitungSisi(diagonal1, diagonal2);
            // Rumus keliling belah ketupat: 4 × sisi miring 
            keliling = 4 * sisi;
            return keliling;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung keliling belah ketupat: " + e.getMessage());
            throw e;
        }
    }
    
    public double getLuas() {
        return luas;
    }
    
    public double getKeliling() {
        return keliling;
    }
    
    public double getSisi() {
        return sisi;
    }
}
