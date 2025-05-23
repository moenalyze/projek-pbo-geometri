package projekpbo.bangunDatar;

import projekpbo.Geometri2D;

public class Lingkaran extends Geometri2D {
    // Atribut khusus untuk lingkaran
    public double jariJari;
    private double luasLingkaran;
    private double kelilingLingkaran;

    // Constructor untuk Lingkaran
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
        luasLingkaran = hitungLuas();
        kelilingLingkaran = hitungKeliling();
    }

    // Implementasi metode hitungLuas() untuk lingkaran
    @Override
    public double hitungLuas() {
        // Rumus luas lingkaran: pi * jari-jari^2
        luasLingkaran = super.pi * jariJari * jariJari;
        return luasLingkaran;
    }

    // Getter untuk Luas Lingkaran
    public double getLuasLingkaran() {
        return luasLingkaran;
    }

    @Override
    public double hitungKeliling() {
        kelilingLingkaran = 2 * Math.PI * jariJari;
        return kelilingLingkaran;
    }

    public double getKelilingLingkaran() {
        return kelilingLingkaran;
    }

}
