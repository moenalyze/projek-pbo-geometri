package consoleView;
import java.util.Scanner;
import bendageometri.Kerucut;

public class KerucutConsole {
    public static void show() {
        Scanner inputKerucut = new Scanner(System.in);
        double jariJari = 0;
        double tinggi = 0;
        

        System.out.println("* Kerucut *");
        while (true) {
            try {
                System.out.print("Masukkan jari-jari Alas kerucut (cm) : ");
                jariJari = Double.parseDouble(inputKerucut.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("⚠  input jari-jari harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("❌ Terjadi kesalahan: " + e.getMessage());
            }
        }
        
        while (true) {
            try {
                System.out.print("Masukkan tinggi kerucut (cm): ");
                tinggi = Double.parseDouble(inputKerucut.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("!! Input tinggi harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("!! Terjadi kesalahan: " + e.getMessage());
            }
        }

        Kerucut kerucut  = new Kerucut(jariJari, tinggi);
        double luasPermukaan = kerucut.hitungLuasPermukaan();
        double volume = kerucut.hitungVolume();

        System.out.println();
        System.out.println("---Hasil Perhitungan---");

        System.out.println("Luas Lingkaran    : " + luasPermukaan);
        System.out.println("Keliling Lingkaran: " + volume);
    }
    
}