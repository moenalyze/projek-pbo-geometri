package projekpbo.bangunDatar;

import projekpbo.Geometri2D;

public class Lingkaran extends Geometri2D {
    // Atribut khusus untuk lingkaran
    protected double jariJari;
    protected double pi = 3.14;


    // Constructor untuk Lingkaran
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
       
    }

    // Implementasi metode hitungLuas() untuk lingkaran
    @Override
    public double hitungLuas() {
        // Rumus luas lingkaran: pi * jari-jari^2
        return pi * jariJari * jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * pi * jariJari;
    }

}
