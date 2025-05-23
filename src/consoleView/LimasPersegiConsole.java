/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consoleView;

import java.util.Scanner;
import projekpbo.bangunRuang.LimasPersegi;

/**
 * Nara Ganteng
 */
public class LimasPersegiConsole {
    public static void show() {
        Scanner input = new Scanner(System.in);
        double sisi = 0;
        double tinggiLimas = 0;

        System.out.println("*** Limas Persegi (Segiempat) ***");

        // Input sisi alas
        while (true) {
            try {
                System.out.print("Masukkan panjang sisi alas (cm): ");
                sisi = Double.parseDouble(input.nextLine());
                if (sisi <= 0) {
                    System.out.println("⚠  Panjang sisi harus > 0. Silakan coba lagi.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("⚠  Input sisi harus berupa angka. Silakan coba lagi.");
            }
        }

        // Input tinggi limas
        while (true) {
            try {
                System.out.print("Masukkan tinggi limas (cm): ");
                tinggiLimas = Double.parseDouble(input.nextLine());
                if (tinggiLimas <= 0) {
                    System.out.println("⚠  Tinggi limas harus > 0. Silakan coba lagi.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("⚠  Input tinggi harus berupa angka. Silakan coba lagi.");
            }
        }

        // Buat objek LimasPersegi dan hitung
        LimasPersegi limas = new LimasPersegi(sisi, tinggiLimas);
        double volume = limas.hitungVolume();
        double luasPermukaan = limas.hitungLuasPermukaan();

        System.out.println();
        System.out.println("---Hasil Perhitungan---");
        System.out.printf("Volume Limas Persegi      : %.2f cm³%n", volume);
        System.out.printf("Luas Permukaan Limas      : %.2f cm²%n", luasPermukaan);
        
        System.out.println("    ");
    }

    public static void main(String[] args) {
        show();
    }
}
