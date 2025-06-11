/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bendageometri;

import bendageometri.Geometri2D;

/**
 *
 * @author User
 */
public class JajarGenjang extends Geometri2D {
    // Atribut khusus untuk jajar genjang
    protected double alas;
    protected double tinggi;
    // protected double sudutLancip;
    protected double sisiMiringJajarGenjang;
    private double luasJajarGenjang;
    private double kelilingJajarGenjang;

    // Constructor untuk JajarGenjang
    public JajarGenjang(double alas, double tinggi, double sisiMiringJajarGenjang) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiringJajarGenjang = sisiMiringJajarGenjang;
    }
    
    public JajarGenjang(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
//        this.sisiMiringJajarGenjang = 0;
    }
    
    // Constructor Overloading
    // Constructor untuk JajarGenjang
    public JajarGenjang(int alas, int tinggi, int sisiMiringJajarGenjang) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiringJajarGenjang = sisiMiringJajarGenjang;
        // Karena dalam segitiga yang terbentuk:
        // sin(sisiMiringJajarGenjang) = tinggi / sisiMiring
        // Maka sisiMiring = tinggi / sin(sisiMiringJajarGenjang)
        // Perlu dikonversi dari derajat ke radian karena Math.sin() menggunakan radian 
        // sudut harus dalam bentuk radian, tidak bisa dalam derajat
        // sisiMiringJajarGenjang = tinggi / Math.sin(Math.toRadians(sisiMiringJajarGenjang));
//        luasJajarGenjang = hitungLuas();
//        kelilingJajarGenjang = hitungKeliling();
    }

    // Implementasi metode hitungLuas() untuk jajar genjang
    @Override
    public double hitungLuas() throws IllegalArgumentException {
        try {
            if (alas <= 0 || tinggi <= 0) {
                throw new IllegalArgumentException("Alas dan tinggi harus lebih besar dari 0");
            }
            luasJajarGenjang = alas * tinggi;
            return luasJajarGenjang;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung luas jajar genjang: " + e.getMessage());
            throw e;
        }
    }

    // Overloaded method
    public double hitungLuas(double alas, double tinggi) throws IllegalArgumentException {
        try {
            if (alas <= 0 || tinggi <= 0) {
                throw new IllegalArgumentException("Alas dan tinggi harus lebih besar dari 0");
            }
            return alas * tinggi;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung luas jajar genjang (overloaded): " + e.getMessage());
            throw e;
        }
    }
    
    // Menggunakan alas dan sudut (dalam derajat atau radian)
    public double hitungLuas(double sisiA, double sisiB, double sudutDerajat) {
        if (sisiA <= 0 || sisiB <= 0 || sudutDerajat <= 0 || sudutDerajat >= 180) {
            throw new IllegalArgumentException("Sisi dan sudut harus bernilai valid");
        }
        double sudutRadian = Math.toRadians(sudutDerajat);
        return sisiA * sisiB * Math.sin(sudutRadian);
    }

    @Override
    public double hitungKeliling() throws IllegalArgumentException {
        try {
            if (alas <= 0 || sisiMiringJajarGenjang <= 0) {
                throw new IllegalArgumentException("Alas dan sisi miring harus lebih besar dari 0");
            }
            kelilingJajarGenjang = 2 * (alas + sisiMiringJajarGenjang);
            return kelilingJajarGenjang;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung keliling jajar genjang: " + e.getMessage());
            throw e;
        }
    }

    // Overloaded method 
    public double hitungKeliling(double alas, double sisiMiring) throws IllegalArgumentException {
        try {
            if (alas <= 0 || sisiMiring <= 0) {
                throw new IllegalArgumentException("Alas dan sisi miring harus lebih besar dari 0");
            }
            return 2 * (alas + sisiMiring);
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung keliling jajar genjang (overloaded): " + e.getMessage());
            throw e;
        }
    }

    
    // Getter untuk keliling Jajar Genjang
    public double getKelilingJajarGenjang() {
        return kelilingJajarGenjang;
    }
    
    // Getter untuk Luas Jajar Genjang
    public double getLuasJajarGenjang() {
        return luasJajarGenjang;
    }
}
