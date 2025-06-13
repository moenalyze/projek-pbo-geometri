package bendageometri;

import bendageometri.Geometri2D;

/**
 * Kelas Persegi yang merepresentasikan bentuk bangun datar Persegi
 *
 * @author User
 */
public class Persegi extends Geometri2D {

    // Atribut khusus untuk persegi
    protected double sisi;
    private double luasPersegi;
    private double kelilingPersegi;

    // Constructor untuk Persegi
    public Persegi(double sisi) {
        this.sisi = sisi;
        luasPersegi = hitungLuas();
        kelilingPersegi = hitungKeliling();
    }

    // Overriding metode hitungLuas
    @Override
    public double hitungLuas() throws IllegalArgumentException {
        if (sisi <= 0) {
            throw new IllegalArgumentException("Sisi harus lebih besar dari 0");
        }
        luasPersegi = sisi * sisi;
        return luasPersegi;
    }

    // Overloaded method hitungLuas dengan parameter
    public double hitungLuas(double sisi) throws IllegalArgumentException {
        if (sisi <= 0) {
            throw new IllegalArgumentException("Sisi harus lebih besar dari 0");
        }
        luasPersegi = sisi * sisi;
        return luasPersegi;
    }

    // Getter untuk luas
    public double getLuasPersegi() {
        return luasPersegi;
    }

    // Overriding metode hitungKeliling
    @Override
    public double hitungKeliling() throws IllegalArgumentException {
        if (sisi <= 0) {
            throw new IllegalArgumentException("Sisi harus lebih besar dari 0");
        }
        kelilingPersegi = 4 * sisi;
        return kelilingPersegi;
    }

    // Overloaded method hitungKeliling dengan parameter
    public double hitungKeliling(double sisi) throws IllegalArgumentException {
        if (sisi <= 0) {
            throw new IllegalArgumentException("Sisi harus lebih besar dari 0");
        }
        kelilingPersegi = 4 * sisi;
        return kelilingPersegi;
    }

    // Getter untuk keliling
    public double getKelilingPersegi() {
        return kelilingPersegi;
    }
}
