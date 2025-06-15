package bendageometri;

public class LimasPersegi extends Persegi {

    // Atribut khusus untuk limas persegi
    protected double tinggiLimas;
    private double volumeLimasPersegi;
    private double luasPermukaanLimasPersegi;

    // ===================== CONSTRUCTOR =====================

    // Constructor berdasarkan tinggi
    public LimasPersegi(double sisi, double tinggiLimas) {
        super(sisi);
        if (sisi <= 0 || tinggiLimas <= 0) {
            throw new IllegalArgumentException("Sisi dan tinggi harus lebih besar dari 0");
        }
        this.tinggiLimas = tinggiLimas;
        this.volumeLimasPersegi = hitungVolume();
        this.luasPermukaanLimasPersegi = hitungLuasPermukaan();
    }

    // Constructor berdasarkan sudut sisi tegak
    public LimasPersegi(double sisi, double sudutDalamDerajat, boolean dariSudut) {
        super(sisi);
        if (!dariSudut) {
            throw new IllegalArgumentException("Gunakan parameter 'dariSudut = true' untuk constructor ini.");
        }
        if (sisi <= 0 || sudutDalamDerajat <= 0 || sudutDalamDerajat >= 90) {
            throw new IllegalArgumentException("Sisi harus > 0 dan sudut antara 0-90 derajat.");
        }

        // Konversi dari derajat ke radian
        double sudutRadian = Math.toRadians(sudutDalamDerajat);

        // Hitung tinggi limas dari sudut
        this.tinggiLimas = Math.tan(sudutRadian) * (0.5 * sisi);
        this.volumeLimasPersegi = hitungVolume();
        this.luasPermukaanLimasPersegi = hitungLuasPermukaan();
    }

    // ===================== VOLUME =====================

    @Override
    public double hitungVolume() {
        if (sisi <= 0 || tinggiLimas <= 0) {
            throw new IllegalArgumentException("Sisi dan tinggi harus lebih besar dari 0");
        }
        volumeLimasPersegi = (1.0 / 3.0) * sisi * sisi * tinggiLimas;
        return volumeLimasPersegi;
    }

    // Overloading
    public double hitungVolume(double sisi, double tinggi) {
        if (sisi <= 0 || tinggi <= 0) {
            throw new IllegalArgumentException("Sisi dan tinggi harus lebih besar dari 0");
        }
        return (1.0 / 3.0) * sisi * sisi * tinggi;
    }

    public double getVolumeLimas() {
        return volumeLimasPersegi;
    }

    // ===================== LUAS PERMUKAAN =====================

    @Override
    public double hitungLuasPermukaan() {
        if (sisi <= 0 || tinggiLimas <= 0) {
            throw new IllegalArgumentException("Sisi dan tinggi limas harus lebih besar dari 0");
        }
        double tinggiSisiTegak = Math.sqrt(Math.pow(0.5 * sisi, 2) + Math.pow(tinggiLimas, 2));
        double luasSegitigaTegak = 0.5 * sisi * tinggiSisiTegak;
        luasPermukaanLimasPersegi = (sisi * sisi) + (4 * luasSegitigaTegak);
        return luasPermukaanLimasPersegi;
    }

    public double hitungLuasPermukaan(double sisi, double tinggi) {
        if (sisi <= 0 || tinggi <= 0) {
            throw new IllegalArgumentException("Sisi dan tinggi harus lebih besar dari 0");
        }
        double tinggiSisiTegak = Math.sqrt(Math.pow(0.5 * sisi, 2) + Math.pow(tinggi, 2));
        double luasSegitigaTegak = 0.5 * sisi * tinggiSisiTegak;
        return (sisi * sisi) + (4 * luasSegitigaTegak);
    }

    public double getLuasPermukaanLimasPersegi() {
        return luasPermukaanLimasPersegi;
    }

    public double getTinggiLimas() {
        return tinggiLimas;
    }
}
