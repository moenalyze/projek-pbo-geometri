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

    public double hitungLuas() {
        luas = (sudut / 360.0) * super.hitungLuas();
        return luas;
    }

    public double hitungKeliling() {
        double panjangBusur = (sudut / 360.0) * 2 * super.pi * jariJari;
        keliling = panjangBusur + 2 * jariJari;
        return keliling;
    }
    
    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }
}
