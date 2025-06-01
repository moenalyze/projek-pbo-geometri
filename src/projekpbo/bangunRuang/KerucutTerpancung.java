   package projekpbo.bangunRuang;

   public class KerucutTerpancung extends Kerucut {
       protected double jariJariAtas;
       protected double tinggi;
       private double volume;
       private double luasPermukaan;

       public KerucutTerpancung(double tinggi, double jariJariAtas, double jariJariBawah) {
           super(jariJariBawah, 0); // jari jari bawah / besar r1
           this.jariJariAtas = jariJariAtas; // jari - jari alas kecil r2
           this.tinggi = tinggi;
       }
       
       public KerucutTerpancung(int tinggi, int jariJariAtas, int jariJariBawah) {
           super(jariJariBawah, 0); // jari jari bawah / besar r1
           this.jariJariAtas = jariJariAtas; // jari - jari alas kecil r2
           this.tinggi = tinggi;
       }

       public double hitungVolume() {
           volume = (1.0 / 3.0) * super.pi * tinggi * (super.jariJari * super.jariJari + jariJariAtas * jariJariAtas + super.jariJari * jariJariAtas);
           return volume;
       }

       public double hitungLuasPermukaan() {
           double garisPelukis = Math.sqrt(Math.pow(tinggi, 2) + Math.pow((super.jariJari - jariJariAtas), 2));

           luasPermukaan = (super.pi * super.jariJari * garisPelukis) + (super.pi * (Math.pow(super.jariJari, 2)));
           return luasPermukaan;
       }
   }
