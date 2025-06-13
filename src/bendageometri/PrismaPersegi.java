package bendageometri;

import bendageometri.Persegi;

public class PrismaPersegi extends Persegi {
    // Atribut khusus untuk PrismaPersegi
    private double volumeKubus;
    private double luasPermukaanKubus;
    private double tinggiprismapersegi;

    // Constructor untuk PrismaPersegi
    public PrismaPersegi(double sisi, double tinggiprismapersegi) {
        super(sisi);
        this.tinggiprismapersegi = tinggiprismapersegi;
        this.volumeKubus = hitungVolume();
        this.luasPermukaanKubus = hitungLuasPermukaan();
    }

    // Getter sisi (diperlukan jika sisi di superclass adalah protected)
    public double getSisi() {
        return this.sisi;
    }

    // ================== VOLUME ==================

    @Override
    public double hitungVolume() throws IllegalArgumentException {
        if (sisi <= 0 || tinggiprismapersegi <= 0) {
            throw new IllegalArgumentException("Sisi dan tinggi prisma harus lebih besar dari 0");
        }
        volumeKubus = sisi * sisi * tinggiprismapersegi;
        return volumeKubus;
    }

    // Overloading Volume
    public double hitungVolume(double sisi, double tinggi) throws IllegalArgumentException {
        if (sisi <= 0 || tinggi <= 0) {
            throw new IllegalArgumentException("Sisi dan tinggi harus lebih besar dari 0");
        }
        return sisi * sisi * tinggi;
    }

    public double getVolumeKubus() {
        return volumeKubus;
    }

    // ================== LUAS PERMUKAAN ==================

    @Override
    public double hitungLuasPermukaan() throws IllegalArgumentException {
        if (sisi <= 0 || tinggiprismapersegi <= 0) {
            throw new IllegalArgumentException("Sisi dan tinggi prisma harus lebih besar dari 0");
        }
        // 2 alas + 4 sisi tegak
        luasPermukaanKubus = 2 * (sisi * sisi) + 4 * sisi * tinggiprismapersegi;
        return luasPermukaanKubus;
    }

    // Overloading Luas Permukaan
    public double hitungLuasPermukaan(double sisi, double tinggi) throws IllegalArgumentException {
        if (sisi <= 0 || tinggi <= 0) {
            throw new IllegalArgumentException("Sisi dan tinggi harus lebih besar dari 0");
        }
        return 2 * (sisi * sisi) + 4 * sisi * tinggi;
    }

    public double getLuasPermukaanKubus() {
        return luasPermukaanKubus;
    }
}
