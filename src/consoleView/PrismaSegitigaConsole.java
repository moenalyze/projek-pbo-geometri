package consoleView;

import java.util.Scanner;
import bendageometri.PrismaSegitiga;

public class PrismaSegitigaConsole {
    public static void show() {
        Scanner input = new Scanner(System.in);
        double sisi = 0;
        double tinggiPrisma = 0;

        System.out.println("*** Prisma Segitiga ***");
        while (true) {
            try {
                System.out.print("Masukkan panjang alas segitiga: ");
                sisi = Double.parseDouble(input.nextLine());
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
                System.out.print("Masukkan tinggi prisma (cm): ");
                tinggiPrisma= Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("!! Input harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("!! Terjadi kesalahan: " + e.getMessage());
            }
        }

        PrismaSegitiga segitiga = new PrismaSegitiga(sisi, tinggiPrisma);
        double volume = segitiga.hitungVolume();
        double luasPermukaan = segitiga.hitungLuasPermukaan();

        System.out.println();
        System.out.println("---Hasil Perhitungan---");

        System.out.println("Volume Prisma Segitiga    : " + volume);
        System.out.println("Luas Permukaan Prisma Segitiga: " + luasPermukaan);
    }
}