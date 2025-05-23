/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consoleView;

import java.util.Scanner;
import projekpbo.bangunRuang.PrismaPersegi;

public class PrismaPersegiConsole {
    public static void show() {
        Scanner input = new Scanner(System.in);
        double sisi = 0;

        System.out.println("*** Prisma Persegi (Kubus) ***");

        // Input sisi dengan validasi
        while (true) {
            try {
                System.out.print("Masukkan panjang sisi alas (cm): ");
                sisi = Double.parseDouble(input.nextLine());
                if (sisi <= 0) {
                    System.out.println("⚠  Panjang sisi harus lebih dari 0. Silakan coba lagi.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("⚠  Input sisi harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("❌ Terjadi kesalahan: " + e.getMessage());
            }
        }

        // Buat objek PrismaPersegi dan hitung
        PrismaPersegi prisma = new PrismaPersegi(sisi);
        double volume = prisma.hitungVolume();
        double luasPermukaan = prisma.hitungLuasPermukaan();

        System.out.println();
        System.out.println("---Hasil Perhitungan---");
        System.out.printf("Volume Prisma (Kubus)     : %.2f cm³%n", volume);
        System.out.printf("Luas Permukaan Prisma     : %.2f cm²%n", luasPermukaan);
        
        System.out.println("    ");
    }

    public static void main(String[] args) {
        show();
    }
}

