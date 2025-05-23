package consoleView;

import java.util.Scanner;
import projekpbo.bangunRuang.LimasPersegiPanjang;

public class LimasPersegiPanjangConsole {
    public static void show() {
        Scanner input = new Scanner(System.in);
        double panjang = 0;
        double lebar = 0;
        double tinggi = 0;

        System.out.println("*** Limas Persegi Panjang ***");
        while (true) {
            try {
                System.out.print("Masukkan panjang (cm) : ");
                panjang = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("⚠  Input panjang harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("❌ Terjadi kesalahan: " + e.getMessage());
            }
        }

        // Input sudut dengan validasi
        while (true) {
            try {
                System.out.print("Masukkan lebar (cm): ");
                lebar = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("!! Input lebar harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("!! Terjadi kesalahan: " + e.getMessage());
            }
        }
        
        while (true) {
            try {
                System.out.print("Masukkan tinggi (cm): ");
                tinggi = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("!! Input tinggi harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("!! Terjadi kesalahan: " + e.getMessage());
            }
        }

        LimasPersegiPanjang LPPanjang = new LimasPersegiPanjang(panjang, lebar, tinggi);
        double luasPermukaan = LPPanjang.hitungLuasPermukaan();
        double volume = LPPanjang.hitungVolume();

        System.out.println();
        System.out.println("---Hasil Perhitungan---");

        System.out.println("Luas Permukaan Limas Persegi Panjang    : " + luasPermukaan);
        System.out.println("Volume Limas Persegi Panjang: " + volume);
    }
}