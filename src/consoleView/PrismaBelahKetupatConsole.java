package consoleView;

import java.util.Scanner;
import projekpbo.bangunDatar.BelahKetupat;
import projekpbo.bangunRuang.PrismaBelahKetupat;

public class PrismaBelahKetupatConsole {
    public static void show() {
        Scanner input = new Scanner(System.in);
        double diagonal1 = 0;
        double diagonal2 = 0;
        double tinggiPrisma = 0;

        System.out.println("*** Prisma Belah Ketupat ***");
        while (true) {
            try {
                System.out.print("Masukkan diagonal 1 (cm) : ");
                diagonal1 = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("!! Input diagonal harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("!! Terjadi kesalahan: " + e.getMessage());
            }
        }
        
        while (true) {
            try {
                System.out.print("Masukkan diagonal 2 (cm) : ");
                diagonal2 = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("!! Input diagonal harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("!! Terjadi kesalahan: " + e.getMessage());
            }
        }
        
        while (true) {
            try {
                System.out.print("Masukkan tinggi prisma (cm) : ");
                tinggiPrisma = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("!! Input tinggi harus berupa angka. Silakan coba lagi.");
            } catch (Exception e) {
                System.out.println("!! Terjadi kesalahan: " + e.getMessage());
            }
        }

        BelahKetupat prismaBelahKetupat = new PrismaBelahKetupat(diagonal1, diagonal2, tinggiPrisma);
        double volume = prismaBelahKetupat.hitungVolume();
        double luasPermukaan = prismaBelahKetupat.hitungLuasPermukaan();

        System.out.println();
        System.out.println("---Hasil Perhitungan---");

        System.out.println("Volume : " + volume);
        System.out.println("Luas Permukaan : " + luasPermukaan);
    }
}
