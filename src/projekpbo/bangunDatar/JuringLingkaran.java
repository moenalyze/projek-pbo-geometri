package projekpbo.bangunDatar;

public class JuringLingkaran extends Lingkaran {
    protected double jariJari;
    protected double sudut;

    public JuringLingkaran(double jariJari, double sudut) {
        super(jariJari);
        this.jariJari = jariJari;
        this.sudut = sudut;
    }

    public double hitungLuas() {
        return (sudut / 360.0) * super.hitungLuas();
    }

    public double hitungKeliling() {
        double panjangBusur = (sudut / 360.0) * 2 * super.pi * jariJari;
        return panjangBusur + 2 * jariJari;
    }
}
