package bendageometri;

import bendageometri.Geometri2D;

public class Trapesium extends Geometri2D {
    // Atribut khusus untuk trapesium
    protected double sisiSejajar1;
    protected double sisiSejajar2;
    protected double tinggi;
    protected double sisiMiring;
    private double luasTrapesium;
    private double kelilingTrapesium;

    // Constructor untuk Trapesium
    public Trapesium(double sisiSejajar1, double sisiSejajar2, double tinggi) {
        this.sisiSejajar1 = sisiSejajar1;
        this.sisiSejajar2 = sisiSejajar2;
        this.tinggi = tinggi;
    }

    public Trapesium(int sisiSejajar1, int sisiSejajar2, int tinggi) {
        this.sisiSejajar1 = sisiSejajar1;
        this.sisiSejajar2 = sisiSejajar2;
        this.tinggi = tinggi;
    }

    // Implementasi metode hitungLuas() untuk trapesium
    @Override
    public double hitungLuas() throws IllegalArgumentException{
        try{
            if (sisiSejajar1 <= 0 || sisiSejajar2 <= 0 || tinggi <= 0) {
                throw new IllegalArgumentException("Panjang sisi dan tinggi tidak boleh 0 atau negatif");
            }
            // Rumus luas trapesium: 0.5 * (alasAtas + alasBawah) * tinggi
            luasTrapesium = 0.5 * (sisiSejajar1 + sisiSejajar2) * tinggi;
            return luasTrapesium;
        }catch (IllegalArgumentException e){
            System.err.println("Error saat menghitung luas trapesium: " + e.getMessage());
            throw e;
        }
    }

    public double hitungLuas(double sisiSejajar1, double sisiSejajar2, double tinggi) throws IllegalArgumentException{
        try{
            if (sisiSejajar1 <= 0 || sisiSejajar2 <= 0 || tinggi <= 0) {
                throw new IllegalArgumentException("Panjang sisi dan tinggi tidak boleh 0 atau negatif");
            }
            return 0.5 * (sisiSejajar1 + sisiSejajar2) * tinggi;
        }catch (IllegalArgumentException e){
            System.err.println("Error saat menghitung luas trapesium: " + e.getMessage());
            throw e;
        }
    }

    // Implementasi metode hitungKeliling() untuk trapesium
    @Override
    public double hitungKeliling() {
        try{
            if (sisiSejajar1 <= 0 || sisiSejajar2 <= 0 || tinggi <= 0) {
                throw new IllegalArgumentException("Panjang sisi dan tinggi tidak boleh 0 atau negatif");
            }
            double selisihSisiSejajar = Math.abs(sisiSejajar1 - sisiSejajar2) / 2;
            sisiMiring = Math.sqrt(Math.pow(selisihSisiSejajar, 2) + Math.pow(tinggi, 2));
            kelilingTrapesium = (sisiSejajar1 + sisiSejajar2) + (2 * sisiMiring);
            return kelilingTrapesium;
        }catch (IllegalArgumentException e){
            System.err.println("Error saat menghitung keliling trapesium: " + e.getMessage());
            throw e;
        }
    }

    public double hitungKeliling(double sisiSejajar1, double sisiSejajar2, double tinggi) {
        try{
            if (sisiSejajar1 <= 0 || sisiSejajar2 <= 0 || tinggi <= 0) {
                throw new IllegalArgumentException("Panjang sisi dan tinggi tidak boleh 0 atau negatif");
            }
            double selisihSisiSejajar = Math.abs(sisiSejajar1 - sisiSejajar2) / 2;
            sisiMiring = Math.sqrt(Math.pow(selisihSisiSejajar, 2) + Math.pow(tinggi, 2));
            return (sisiSejajar1 + sisiSejajar2) + (2 * sisiMiring);
        }catch (IllegalArgumentException e){
            System.err.println("Error saat menghitung keliling trapesium: " + e.getMessage());
            throw e;
        }
    }
    
    // Getter untuk Luas Trapesium
    public double getLuasTrapesium() {
        return luasTrapesium;
    }

    // Getter untuk Keliling Trapesium
    public double getKelilingTrapesium() {
        return kelilingTrapesium;
    }

}
