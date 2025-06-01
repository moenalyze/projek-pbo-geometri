package projekpbo.bangunRuang;

import projekpbo.bangunDatar.Persegi;


public class PrismaPersegi extends Persegi {
    // Atribut khusus untuk PrismaPersegi
    private double volumeKubus;
    private double luasPermukaanKubus;
    private double tinggiprismapersegi; //lupa ada tingginya cyok

    // Constructor untuk PrismaPersegi
    public PrismaPersegi(double sisi, double tinggiprismapersegi) {
        super(sisi);
        volumeKubus = hitungVolume();
        luasPermukaanKubus = hitungLuasPermukaan();
    }
    
    public double getSisi() {
    return this.sisi; // diasumsikan 'sisi' dideklarasikan protected atau private pada Persegi
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
        luasPermukaanKubus =    2 * Math.pow(sisi, 2) + 4 * sisi * tinggiprismapersegi;
        return luasPermukaanKubus;
    }
    
    public double getLuasPermukaanKubus(){
        return luasPermukaanKubus;
    }

}
