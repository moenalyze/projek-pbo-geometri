package projekpbo.bangunDatar;

import projekpbo.Geometri2D;

public class Segitiga extends Geometri2D {
    // Atribut khusus untuk segitiga
    protected double alas;
    protected double tinggi;
    private double luasSegitiga;
    private double kelilingSegitiga;

    // Constructor untuk Segitiga
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
//        luasSegitiga = hitungLuas();
//        kelilingSegitiga = hitungKeliling();
    }

    // Implementasi metode hitungLuas() untuk segitiga
    @Override
    public double hitungLuas() {
        // Rumus luas segitiga: 0.5 * alas * tinggi
        luasSegitiga = 0.5 * alas * tinggi;
        return luasSegitiga;
    }

    // Getter untuk Luas Segitiga
    public double getLuasSegitiga() {
        return luasSegitiga;
    }

    @Override
    public double hitungKeliling() {
        // Rumus keliling segitiga: 3 * alas - segitiga sama alas
        kelilingSegitiga = 3 * alas;
        return kelilingSegitiga;
    }

    // Getter untuk Keliling Segitiga
    public double getKelilingSegitiga() {
      return kelilingSegitiga;
    }
}
