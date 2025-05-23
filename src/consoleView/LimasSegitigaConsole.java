package ConsoleView;

import java.util.Scanner;
import projekpbo.bangunRuang.LimasSegitiga;

public class LimasSegitigaConsole {
    public static void show() {
        Scanner input = new Scanner(System.in);
        double alasSegitiga = 0;
        double tinggiSegitiga = 0;
        double tinggiLimas = 0;

        System.out.println("*** Limas Segitiga ***");
        while (true) {
            try {
                System.out.print("Masukkan panjang alas segitiga: ");
                alasSegitiga = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("⚠  Input harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("❌ Terjadi kesalahan: " + e.getMessage());
            }
        }
        
        while (true) {
            try {
                System.out.print("Masukkan tinggi segitiga (cm): ");
                tinggiSegitiga = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("⚠  Input harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("❌ Terjadi kesalahan: " + e.getMessage());
            }
        }

        // Input sudut dengan validasi
        while (true) {
            try {
                System.out.print("Masukkan tinggi limas (cm): ");
                tinggiLimas= Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("!! Input harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("!! Terjadi kesalahan: " + e.getMessage());
            }
        }

        LimasSegitiga segitiga = new LimasSegitiga(alasSegitiga, tinggiSegitiga, tinggiLimas);
        double volume = segitiga.hitungVolume();
        double luasPermukaan = segitiga.hitungLuasPermukaan();

        System.out.println();
        System.out.println("---Hasil Perhitungan---");

        System.out.println("Volume Limas Segitiga    : " + volume);
        System.out.println("Luas Permukaan Limas Segitiga: " + luasPermukaan);
    }
}