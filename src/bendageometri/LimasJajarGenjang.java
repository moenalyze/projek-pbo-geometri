package bendageometri;

public class LimasJajarGenjang extends JajarGenjang {

    private double tinggiLimas;
    private double volumeLimasJajarGenjang;
    private double luasPermukaanLimasJajarGenjang;

    // Konstruktor
    public LimasJajarGenjang(double alas, double tinggiJajarGenjang, double sudutLancip, double tinggiLimas) {
        super(alas, tinggiJajarGenjang, sudutLancip);
        this.tinggiLimas = tinggiLimas;
    }
    

    // Override hitungVolume dengan try-catch
    @Override
    public double hitungVolume() {
        try {
            if (tinggiLimas <= 0 || alas <= 0 || tinggi <= 0) {
                throw new IllegalArgumentException("Parameter tidak boleh <= 0");
            }
            volumeLimasJajarGenjang = (1.0 / 3.0) * super.hitungLuas() * tinggiLimas;
        } catch (Exception e) {
            System.out.println("Error menghitung volume: " + e.getMessage());
            volumeLimasJajarGenjang = 0;
        }
        return volumeLimasJajarGenjang;
    }

    // Overloading hitungVolume dengan parameter
    public double hitungVolume(double alas, double tinggiJajarGenjang, double tinggiLimas) {
        try {
            if (alas <= 0 || tinggiJajarGenjang <= 0 || tinggiLimas <= 0) {
                throw new IllegalArgumentException("Nilai input harus > 0");
            }
            double luasAlas = alas * tinggiJajarGenjang;
            return (1.0 / 3.0) * luasAlas * tinggiLimas;
        } catch (Exception e) {
            System.out.println("Error menghitung volume overload: " + e.getMessage());
            return 0;
        }
    }

    public double getVolumeLimasJajarGenjang() {
        return volumeLimasJajarGenjang;
    }

    // Override hitungLuasPermukaan dengan try-catch
    @Override
    public double hitungLuasPermukaan() {
        try {
            double alas = super.alas;
            double tinggiJajarGenjang = super.tinggi;
            double sisiMiring = super.sisiMiringJajarGenjang;

            if (alas <= 0 || tinggiJajarGenjang <= 0 || tinggiLimas <= 0 || sisiMiring <= 0) {
                throw new IllegalArgumentException("Nilai sisi atau tinggi tidak boleh <= 0");
            }

            double tinggiSisiTegak1 = Math.sqrt(Math.pow(alas / 2, 2) + Math.pow(tinggiLimas, 2));
            double tinggiSisiTegak2 = Math.sqrt(Math.pow(sisiMiring / 2, 2) + Math.pow(tinggiLimas, 2));

            double luasSisiTegak1 = 0.5 * alas * tinggiSisiTegak1;
            double luasSisiTegak2 = 0.5 * sisiMiring * tinggiSisiTegak2;

            luasPermukaanLimasJajarGenjang = super.hitungLuas() + 2 * (luasSisiTegak1 + luasSisiTegak2);
        } catch (Exception e) {
            System.out.println("Error menghitung luas permukaan: " + e.getMessage());
            luasPermukaanLimasJajarGenjang = 0;
        }
        return luasPermukaanLimasJajarGenjang;
    }

    // Overloading hitungLuasPermukaan dengan parameter
    public double hitungLuasPermukaan(double alas, double tinggiJajarGenjang, double sisiMiring, double tinggiLimas) {
        try {
            if (alas <= 0 || tinggiJajarGenjang <= 0 || sisiMiring <= 0 || tinggiLimas <= 0) {
                throw new IllegalArgumentException("Input tidak boleh nol atau negatif.");
            }

            double luasAlas = alas * tinggiJajarGenjang;
            double tinggiSisiTegak1 = Math.sqrt(Math.pow(alas / 2, 2) + Math.pow(tinggiLimas, 2));
            double tinggiSisiTegak2 = Math.sqrt(Math.pow(sisiMiring / 2, 2) + Math.pow(tinggiLimas, 2));

            double luasSisiTegak1 = 0.5 * alas * tinggiSisiTegak1;
            double luasSisiTegak2 = 0.5 * sisiMiring * tinggiSisiTegak2;

            return luasAlas + 2 * (luasSisiTegak1 + luasSisiTegak2);
        } catch (Exception e) {
            System.out.println("Error menghitung luas permukaan overload: " + e.getMessage());
            return 0;
        }
    }

    public double getLuasPermukaanLimasJajarGenjang() {
        return luasPermukaanLimasJajarGenjang;
    }
}


/* Note Ruhul Buat jelasin codingannya
1. Overloadingnya udah di terapkan ke semua method geometri, jadi 1 method yang sama memiliki parameter yang berbeda
2. Klo ga pake parameter, angkanya diambil dari constructornya, klo pake parameter nanti angkanya input ulang beda dengan di constructor
3. Try catch untuk mencegah input yang tidak di inginkan, nanti ada pesan error. Misal user input 0 atau huruf
4. 

*/