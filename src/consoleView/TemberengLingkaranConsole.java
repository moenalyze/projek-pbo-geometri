package consoleView;

import java.util.Scanner;
import bendageometri.TemberengLingkaran;


// ubah di class Tembereng lingkaran jadi, sebelumnya jariJari tidak dipanggil dari super  double luasJuring = (sudut / 360.0) * Math.PI * super.jariJari * super.jariJari;
//        double tinggiSegitiga = Math.sqrt(Math.pow(super.jariJari, 2) - Math.pow(taliBusur / 2, 2));
public class TemberengLingkaranConsole {
    public static void show() {
        Scanner input = new Scanner(System.in);
        double taliBusur = 0;
        double busur = 0;
        double jariJari = 0;
        double sudut = 0;

        System.out.println("*** Tembereng Lingkaran ***");
        while (true) {
            try {
                System.out.print("Masukkan tali busur (cm) : ");
                taliBusur = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input tali busur harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Masukkan busur (cm): ");
                busur = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("!! Input busur harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("!! Terjadi kesalahan: " + e.getMessage());
            }
        }
        
        while (true) {
            try {
                System.out.print("Masukkan sudut (derajat): ");
                sudut = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("!! Input sudut harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("!! Terjadi kesalahan: " + e.getMessage());
            }
        }
        
        while (true) {
            try {
                System.out.print("Masukkan jari-jari (cm): ");
                jariJari = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("!! Input jari-jari harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("!! Terjadi kesalahan: " + e.getMessage());
            }
        }
        TemberengLingkaran tembereng = new TemberengLingkaran(jariJari, taliBusur, sudut, busur);
        double luas = tembereng.hitungLuas();
        double keliling = tembereng.hitungKeliling();

        System.out.println();
        System.out.println("---Hasil Perhitungan---");

        System.out.println("Luas tembereng lingkaran    : " + luas);
        System.out.println("Keliling tembereng lingkaran : " + keliling);
    }
    
}