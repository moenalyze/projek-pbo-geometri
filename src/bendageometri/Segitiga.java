package bendageometri;

import bendageometri.Geometri2D;

public class Segitiga extends Geometri2D {
    // Atribut khusus untuk segitiga
    protected double sisi;
    private double luasSegitiga;
    private double kelilingSegitiga;

    // Constructor untuk Segitiga
    public Segitiga(double sisi) {
        this.sisi = sisi;
//        luasSegitiga = hitungLuas();
//        kelilingSegitiga = hitungKeliling();
    }

    // Implementasi metode hitungLuas() untuk segitiga
    @Override
    public double hitungLuas() throws IllegalArgumentException {
        try{
            if (sisi <= 0) {
                throw new IllegalArgumentException("Sisi tidak boleh 0 atau negatif");
            }
            luasSegitiga = ((sisi * sisi) / 4) * Math.sqrt(3);
            return luasSegitiga;
        }catch (IllegalArgumentException e){
            System.err.println("Error saat menghitung luas jajar genjang: " + e.getMessage());
            throw e;
        }
    }

    public double hitungLuas(double sisi) throws IllegalArgumentException {
        try{
            if (sisi <= 0) {
                throw new IllegalArgumentException("Sisi tidak boleh 0 atau negatif");
            }
            return ((sisi * sisi) / 4) * Math.sqrt(3);
        }catch (IllegalArgumentException e){
            System.err.println("Error saat menghitung luas jajar genjang: " + e.getMessage());
            throw e;
        }
    }

    @Override
    public double hitungKeliling() throws IllegalArgumentException {
        try{
            if (sisi <= 0) {
                throw new IllegalArgumentException("Sisi tidak boleh 0 atau negatif");
            }
            // Rumus keliling segitiga: 3 * sisi - segitiga sama sisi
            kelilingSegitiga = 3 * sisi;
            return kelilingSegitiga;
        }catch(IllegalArgumentException e){
            System.err.println("Error saat menghitung keliling jajar genjang: " + e.getMessage());
            throw e;
        }
    }

    public double hitungKeliling(double sisi) throws IllegalArgumentException {
        try{
            if (sisi <= 0) {
                throw new IllegalArgumentException("Sisi tidak boleh 0 atau negatif");
            }
            // Rumus keliling segitiga: 3 * sisi - segitiga sama sisi
            return 3 * sisi;
        }catch(IllegalArgumentException e){
            System.err.println("Error saat menghitung keliling jajar genjang: " + e.getMessage());
            throw e;
        }
    }

    // Getter untuk Keliling Segitiga
    public double getKelilingSegitiga() {
      return kelilingSegitiga;
    }

    // Getter untuk Luas Segitiga
    public double getLuasSegitiga() {
        return luasSegitiga;
    }
}
