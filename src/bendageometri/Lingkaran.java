package bendageometri;

import bendageometri.Geometri2D;

public class Lingkaran extends Geometri2D {
    // Atribut khusus untuk lingkaran
    protected double jariJari;
    public static final double pi = 3.14;
    private double luasLingkaran;
    private double kelilingLingkaran;

    // Constructor untuk Lingkaran
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    
    public Lingkaran(int jariJari) {
        this.jariJari = jariJari;
    }

    // Implementasi metode hitungLuas() untuk lingkaran
    @Override
    public double hitungLuas() throws IllegalArgumentException {
        try {
            if (jariJari <= 0) {
                throw new IllegalArgumentException("Jari-jari harus lebih besar dari 0");
            }
            // Rumus luas lingkaran: pi * jari-jari^2
            luasLingkaran = pi * jariJari * jariJari;
            return luasLingkaran;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung luas: " + e.getMessage());
            throw e; // Melempar ulang exception untuk ditangani oleh pemanggil
        }
    }
    
    public double hitungLuas(int jariJari) throws IllegalArgumentException {
        try {
            if (jariJari <= 0) {
                throw new IllegalArgumentException("Jari-jari harus lebih besar dari 0");
            }
            // Rumus luas lingkaran: pi * jari-jari^2
            luasLingkaran = pi * jariJari * jariJari;
            return luasLingkaran;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung luas (overloaded): " + e.getMessage());
            throw e; // Melempar ulang exception untuk ditangani oleh pemanggil
        }
    }
    
    public double hitungLuas(double jariJari) throws IllegalArgumentException {
        try {
            if (jariJari <= 0) {
                throw new IllegalArgumentException("Jari-jari harus lebih besar dari 0");
            }
            // Rumus luas lingkaran: pi * jari-jari^2
            luasLingkaran = pi * jariJari * jariJari;
            return luasLingkaran;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung luas (overloaded): " + e.getMessage());
            throw e; // Melempar ulang exception untuk ditangani oleh pemanggil
        }
    }

    // Getter
    public double getLuasLingkaran() {
        return luasLingkaran;
    }

    @Override
    public double hitungKeliling() throws IllegalArgumentException {
        try {
            if (jariJari <= 0) {
                throw new IllegalArgumentException("Jari-jari harus lebih besar dari 0");
            }
            kelilingLingkaran = 2 * pi * jariJari;
            return kelilingLingkaran;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung keliling: " + e.getMessage());
            throw e; // Melempar ulang exception untuk ditangani oleh pemanggil
        }
    }
    
    // Overloading
    public double hitungKeliling(int jariJari) throws IllegalArgumentException {
        try {
            if (jariJari <= 0) {
                throw new IllegalArgumentException("Jari-jari harus lebih besar dari 0");
            }
            kelilingLingkaran = 2 * pi * jariJari;
            return kelilingLingkaran;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung keliling (overloaded): " + e.getMessage());
            throw e; // Melempar ulang exception untuk ditangani oleh pemanggil
        }
    }
    
    // Overloading
    public double hitungKeliling(double jariJari) throws IllegalArgumentException {
        try {
            if (jariJari <= 0) {
                throw new IllegalArgumentException("Jari-jari harus lebih besar dari 0");
            }
            kelilingLingkaran = 2 * pi * jariJari;
            return kelilingLingkaran;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung keliling (overloaded): " + e.getMessage());
            throw e; // Melempar ulang exception untuk ditangani oleh pemanggil
        }
    }

    // Getter
    public double getKelilingLingkaran() {
        return kelilingLingkaran;
    }
}
