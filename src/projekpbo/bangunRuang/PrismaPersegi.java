package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Persegi;


public class PrismaPersegi extends Persegi {
    // Atribut khusus untuk PrismaPersegi
    private double volumeKubus;
    private double luasPermukaanKubus;

    // Constructor untuk PrismaPersegi
    public PrismaPersegi(double sisi) {
        super(sisi);
        volumeKubus = hitungVolume();
        luasPermukaanKubus = hitungLuasPermukaan();
    }

    // Implementasi metode hitungVolume() untuk PrismaPersegi
    @Override
    public double hitungVolume() {
        // Volume PrismaPersegi = luas Persegi * tinggi PrismaPersegi
        volumeKubus = Math.pow(sisi, 3);
        return volumeKubus;
    }

    // Getter untuk Volume PrismaPersegi
    public double getVolumeKubus() {
        return volumeKubus;
    }
    
    // Implementasi metode hitungLuasPermukaan() untuk PrismaPersegi
    @Override
    public double hitungLuasPermukaan() {
        // Luas Permukaan PrismaPersegi = 6 * (luas persegi)
        luasPermukaanKubus =  6 * super.hitungLuas();
        return luasPermukaanKubus;
    }
    
    public double getLuasPermukaanKubus(){
        return luasPermukaanKubus;
    }

}
