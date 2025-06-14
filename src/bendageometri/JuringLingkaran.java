package bendageometri;

public class JuringLingkaran extends Lingkaran {
    protected double jariJari;
    protected double sudut;
    private double luas;
    private double keliling;

    public JuringLingkaran(double jariJari, double sudut) {
        super(jariJari);
        this.jariJari = jariJari;
        this.sudut = sudut;
    }
    
    // overloaded constructor
    public JuringLingkaran(int jariJari, int sudut) {
        super(jariJari);
        this.jariJari = jariJari;
        this.sudut = sudut;
    }

    public double hitungLuas()  throws IllegalArgumentException {
        try {
            if (jariJari <= 0) {
                throw new IllegalArgumentException("Panjang jari-jari harus lebih besar dari 0");
            }
            else if (sudut <= 0 || sudut > 360) {
                throw new IllegalArgumentException("Besar sudut harus di rentang 0 - 360°");
            }
            luas = (sudut / 360.0) * super.hitungLuas();
            return luas;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung luas juring lingkaran: " + e.getMessage());
            throw e;
        }
    }
    
    // overloaded method
    public double hitungLuas(double jariJari, double sudut)  throws IllegalArgumentException {
        try {
            if (jariJari <= 0) {
                throw new IllegalArgumentException("Panjang jari-jari harus lebih besar dari 0");
            }
            else if (sudut <= 0 & sudut > 360) {
                throw new IllegalArgumentException("Besar sudut harus di rentang 0 - 360°");
            }
            luas = (sudut / 360.0) * super.hitungLuas();
            return luas;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung luas juring lingkaran: " + e.getMessage());
            throw e;
        }
    }

    public double hitungKeliling() {
        try {
            if (jariJari <= 0) {
                throw new IllegalArgumentException("Panjang jari-jari harus lebih besar dari 0");
            }
            else if (sudut <= 0 & sudut > 360) {
                throw new IllegalArgumentException("Besar sudut harus di rentang 0 - 360°");
            }
            double panjangBusur = (sudut / 360.0) * 2 * super.pi * jariJari;
            keliling = panjangBusur + 2 * jariJari;
            return keliling;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung keliling juring lingkaran: " + e.getMessage());
            throw e;
        }
    }
    
    
    // overloaded method
    public double hitungKeliling(double jariJari, double sudut) {
        try {
            if (jariJari <= 0) {
                throw new IllegalArgumentException("Panjang jari-jari harus lebih besar dari 0");
            }
            else if (sudut <= 0 & sudut > 360) {
                throw new IllegalArgumentException("Besar sudut harus di rentang 0 - 360°");
            }
            double panjangBusur = (sudut / 360.0) * 2 * super.pi * jariJari;
            keliling = panjangBusur + 2 * jariJari;
            return keliling;
        } catch (IllegalArgumentException e) {
            System.err.println("Error saat menghitung keliling juring lingkaran: " + e.getMessage());
            throw e;
        }
    }
    
    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }
}
