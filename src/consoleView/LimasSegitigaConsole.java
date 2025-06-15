package consoleView;

import java.util.Scanner;
import bendageometri.LimasSegitiga;

public class LimasSegitigaConsole {
    public static void show() {
        Scanner input = new Scanner(System.in);
        double sisi = 0;

        System.out.println("*** Limas Segitiga ***");
        while (true) {
            try {
                System.out.print("Masukkan panjang rusuk: ");
                sisi = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("⚠  Input harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("❌ Terjadi kesalahan: " + e.getMessage());
            }
        }
        
        LimasSegitiga segitiga = new LimasSegitiga(sisi);
        double volume = segitiga.hitungVolume();
        double luasPermukaan = segitiga.hitungLuasPermukaan();

        System.out.println();
        System.out.println("---Hasil Perhitungan---");

        System.out.println("Volume Limas Segitiga    : " + volume);
        System.out.println("Luas Permukaan Limas Segitiga: " + luasPermukaan);
    }
}