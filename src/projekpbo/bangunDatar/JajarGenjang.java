/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekpbo.bangunDatar;

import projekpbo.Geometri2D;

/**
 *
 * @author User
 */
public class JajarGenjang extends Geometri2D {
    // Atribut khusus untuk jajar genjang
    protected double alas;
    protected double tinggi;
    protected double sudutLancip;
    protected double sisiMiringJajarGenjang;
    private double luasJajarGenjang;
    private double kelilingJajarGenjang;

    // Constructor untuk JajarGenjang
    public JajarGenjang(double alas, double tinggi, double sudutLancip) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sudutLancip = sudutLancip;
        // Karena dalam segitiga yang terbentuk:
        // sin(sudutLancip) = tinggi / sisiMiring
        // Maka sisiMiring = tinggi / sin(sudutLancip)
        // Perlu dikonversi dari derajat ke radian karena Math.sin() menggunakan radian 
        // sudut harus dalam bentuk radian, tidak bisa dalam derajat
        sisiMiringJajarGenjang = tinggi / Math.sin(Math.toRadians(sudutLancip));
        luasJajarGenjang = hitungLuas();
        kelilingJajarGenjang = hitungKeliling();
    }

    // Implementasi metode hitungLuas() untuk jajar genjang
    @Override
    public double hitungLuas() {
        // Rumus luas jajar genjang: alas * tinggi
        luasJajarGenjang = alas * tinggi;
        return luasJajarGenjang;
    }

    // Getter untuk Luas Jajar Genjang
    public double getLuasJajarGenjang() {
        return luasJajarGenjang;
    }

    @Override
    public double hitungKeliling() {
        // kelilingJajarGenjang = 2 * (alas + sisiMiring); 
        kelilingJajarGenjang = 2 * (alas + sisiMiringJajarGenjang);
        return kelilingJajarGenjang;
    }
    
    // Getter untuk keliling Jajar Genjang
    public double getKelilingJajarGenjang() {
        return kelilingJajarGenjang;
    }
}
